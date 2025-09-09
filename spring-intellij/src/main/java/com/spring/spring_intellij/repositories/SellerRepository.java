package com.spring.spring_intellij.repositories;

import com.spring.spring_intellij.domain.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
}
