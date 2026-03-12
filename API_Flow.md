# Policy Management API Flow

This document explains the flow of APIs implemented in the project.

## 1 Create Policy

Endpoint:
POST /api/v1/policies

Description:
Creates a new insurance policy.

Request Example:

{
 "customerName": "Suresh",
 "policyType": "Health",
 "policyAmount": 500000
}

Response:

{
 "policyId": "12345",
 "customerName": "Suresh",
 "status": "ACTIVE"
}

---

## 2 Get All Policies

Endpoint:
GET /api/v1/policies

Description:
Fetches all policies.

---

## 3 Get Policy by ID

Endpoint:
GET /api/v1/policies/{id}

Description:
Fetch a specific policy using policy ID.

---

## 4 Update Policy Status

Endpoint:
PUT /api/v1/policies/{id}/status

Description:
Updates the policy status.

Request:

{
 "status": "INACTIVE"
}

---

## 5 Delete Policy

Endpoint:
DELETE /api/v1/policies/{id}

Description:
Deletes the policy from the system.
