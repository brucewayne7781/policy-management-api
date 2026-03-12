package com.example.policyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.policyapi.entity.Policy;

public interface PolicyRepository extends JpaRepository<Policy,String> {
}