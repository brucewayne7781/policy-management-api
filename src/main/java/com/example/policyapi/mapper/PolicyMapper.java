package com.example.policyapi.mapper;

import com.example.policyapi.entity.Policy;
import com.example.policyapi.dto.response.PolicyResponse;

public class PolicyMapper {

    public static PolicyResponse toResponse(Policy policy){

        PolicyResponse response = new PolicyResponse();

        response.setPolicyId(policy.getPolicyId());
        response.setCustomerName(policy.getCustomerName());
        response.setStatus(policy.getStatus());

        return response;
    }
}