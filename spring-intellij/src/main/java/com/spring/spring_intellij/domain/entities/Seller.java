package com.spring.spring_intellij.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "seller")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Seller implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;
}
