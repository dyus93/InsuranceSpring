package com.regionosago.cms.persistence.repositories;

import com.regionosago.cms.persistence.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employees, UUID> {
}
