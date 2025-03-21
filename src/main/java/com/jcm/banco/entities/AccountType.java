package com.jcm.banco.entities;

import lombok.Getter;

@Getter
public enum AccountType {
    CURRENT("current"),
    DIGITAL("digital"),
    INVESTMENT("investment"),
    SAVINGS("savings");

    private final String type;

    AccountType(String type){
        this.type = type;
    }

}
