package com.example.jdbspostgresql;

import lombok.Data;

@Data
public class BankAccountInfo {

    private Long id;
    private String fullName;
    private double balance;

    public BankAccountInfo(Long id, String fullName, double balance) {
        super();
        this.id = id;
        this.fullName = fullName;
        this.balance = balance;
    }

}
