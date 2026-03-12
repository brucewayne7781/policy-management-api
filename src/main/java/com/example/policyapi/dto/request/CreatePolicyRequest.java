package com.example.policyapi.dto.request;

public class CreatePolicyRequest {

    private String customerName;
    private String policyType;
    private int policyAmount;

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getPolicyType() { return policyType; }
    public void setPolicyType(String policyType) { this.policyType = policyType; }

    public int getPolicyAmount() { return policyAmount; }
    public void setPolicyAmount(int policyAmount) { this.policyAmount = policyAmount; }
}