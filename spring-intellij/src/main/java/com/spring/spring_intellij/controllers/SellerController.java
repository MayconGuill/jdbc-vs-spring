package com.spring.spring_intellij.controllers;

import com.spring.spring_intellij.domain.entities.Seller;
import com.spring.spring_intellij.dtos.SellerDTO;
import com.spring.spring_intellij.services.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/seller")
@AllArgsConstructor
public class SellerController {
    private final SellerService service;

    @PostMapping
    public Seller postSeller(@RequestBody SellerDTO body) {
        return service.postSeller(body);
    }
}
