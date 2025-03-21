package com.jcm.banco.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ig;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit",scale = 13 , precision = 2)
    private BigDecimal limit;
}
