package com.spring.spring_intellij.services;

import com.spring.spring_intellij.domain.entities.Department;
import com.spring.spring_intellij.domain.entities.Seller;
import com.spring.spring_intellij.dtos.SellerDTO;
import com.spring.spring_intellij.repositories.DepartmentRepository;
import com.spring.spring_intellij.repositories.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class SellerService {

    private final SellerRepository repository;
    private final DepartmentRepository departmentRepository;

    public Seller postSeller(SellerDTO data) {

        Seller seller = new Seller();
        seller.setName(data.name());
        seller.setEmail(data.email());
        if (data.birthDate() == null) {
            seller.setBirthDate(new Date());
        }
        seller.setBaseSalary(data.baseSalary());

        Department department = new Department();
        department.setName(data.departmentName());
        Department newDepartment = departmentRepository.save(department);

        seller.setDepartment(newDepartment);

        return repository.save(seller);
    }
}
