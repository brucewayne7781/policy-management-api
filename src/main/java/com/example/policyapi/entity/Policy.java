package com.example.policyapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Policy {

    @Id
    private String policyId;

    private String customerName;
    private String policyType;
    private int policyAmount;
    private String status;

    public String getPolicyId() { return policyId; }
    public void setPolicyId(String policyId) { this.policyId = policyId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getPolicyType() { return policyType; }
    public void setPolicyType(String policyType) { this.policyType = policyType; }

    public int getPolicyAmount() { return policyAmount; }
    public void setPolicyAmount(int policyAmount) { this.policyAmount = policyAmount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}