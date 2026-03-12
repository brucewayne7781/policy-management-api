package com.example.policyapi.service;

import java.util.List;

import com.example.policyapi.dto.request.*;
import com.example.policyapi.dto.response.PolicyResponse;

public interface PolicyService {

    PolicyResponse createPolicy(CreatePolicyRequest request);

    PolicyResponse getPolicy(String policyId);

    void updatePolicyStatus(String policyId, UpdateStatusRequest request);

    void deletePolicy(String policyId);
    
    List<PolicyResponse> getAllPolicies();
}