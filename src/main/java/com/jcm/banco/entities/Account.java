package com.jcm.banco.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    private String FinancialInstitution;

    @Column(scale = 2 , precision = 13)
    private BigDecimal balance;

    @Column(name = "additional_limit", scale = 13 , precision = 2)
    private BigDecimal limit;

}
