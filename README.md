# Policy Management API

This project demonstrates a REST API for managing insurance policies.

## Tech Stack

- Java
- Spring Boot
- H2 Database
- REST APIs
- OpenAPI Documentation

## Project Architecture

Controller → Service → Repository → Database

## APIs Implemented

1. Create Policy
2. Get All Policies
3. Get Policy by ID
4. Update Policy Status
5. Delete Policy

## Example API

POST /api/v1/policies

Request

{
 "customerName": "Suresh",
 "policyType": "Health",
 "policyAmount": 500000
}

Response

{
 "policyId": "12345",
 "customerName": "Suresh",
 "status": "ACTIVE"
}
