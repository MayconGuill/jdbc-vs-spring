package com.spring.spring_intellij.repositories;

import com.spring.spring_intellij.domain.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
