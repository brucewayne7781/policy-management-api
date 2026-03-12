package com.example.policyapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.policyapi.dto.request.*;
import com.example.policyapi.dto.response.PolicyResponse;
import com.example.policyapi.service.PolicyService;

@RestController
@RequestMapping("/api/v1/policies")
public class PolicyController {

    @Autowired
    private PolicyService service;

    @PostMapping
    public PolicyResponse createPolicy(@RequestBody CreatePolicyRequest request){
        return service.createPolicy(request);
    }
    
    @GetMapping
    public List<PolicyResponse> getAllPolicies(){
        return service.getAllPolicies();
    }

    @GetMapping("/{id}")
    public PolicyResponse getPolicy(@PathVariable String id){
        return service.getPolicy(id);
    }

    @PutMapping("/{id}/status")
    public String updateStatus(@PathVariable String id,
                               @RequestBody UpdateStatusRequest request){

        service.updatePolicyStatus(id,request);
        return "Status Updated";
    }

    @DeleteMapping("/{id}")
    public String deletePolicy(@PathVariable String id){

        service.deletePolicy(id);
        return "Policy Deleted";
    }
}