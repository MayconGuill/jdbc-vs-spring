package com.spring.spring_intellij.dtos;

import java.util.Date;

public record SellerDTO(
        String name,
        String email,
        Date birthDate,
        Double baseSalary,
        String departmentName
) {
}
