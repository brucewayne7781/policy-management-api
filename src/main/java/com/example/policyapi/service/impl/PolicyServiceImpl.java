package com.example.policyapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.policyapi.constants.ApiConstants;
import com.example.policyapi.dto.request.*;
import com.example.policyapi.dto.response.PolicyResponse;
import com.example.policyapi.entity.Policy;
import com.example.policyapi.mapper.PolicyMapper;
import com.example.policyapi.repository.PolicyRepository;
import com.example.policyapi.service.PolicyService;
import com.example.policyapi.util.IdGenerator;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyRepository repository;

    @Override
    public PolicyResponse createPolicy(CreatePolicyRequest request) {

        Policy policy = new Policy();

        policy.setPolicyId(IdGenerator.generateId());
        policy.setCustomerName(request.getCustomerName());
        policy.setPolicyType(request.getPolicyType());
        policy.setPolicyAmount(request.getPolicyAmount());
        policy.setStatus(ApiConstants.ACTIVE_STATUS);

        repository.save(policy);

        return PolicyMapper.toResponse(policy);
    }

    @Override
    public PolicyResponse getPolicy(String policyId) {

        Policy policy = repository.findById(policyId)
                .orElseThrow(() -> new RuntimeException("Policy not found"));

        return PolicyMapper.toResponse(policy);
    }

    @Override
    public void updatePolicyStatus(String policyId, UpdateStatusRequest request) {

        Policy policy = repository.findById(policyId)
                .orElseThrow(() -> new RuntimeException("Policy not found"));

        policy.setStatus(request.getStatus());

        repository.save(policy);
    }

    @Override
    public void deletePolicy(String policyId) {

        repository.deleteById(policyId);
    }
    
    @Override
    public List<PolicyResponse> getAllPolicies() {

        List<Policy> policies = repository.findAll();

        return policies.stream()
                .map(PolicyMapper::toResponse)
                .toList();
    }
}