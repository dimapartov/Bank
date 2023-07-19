package com.example.bank.dtos;

import java.math.BigDecimal;

public class DepositMoneyDto {

    private Integer number;
    private BigDecimal money;

    public DepositMoneyDto(Integer number, Integer money) {
        this.number = number;
        this.money = new BigDecimal(money);
    }

    public DepositMoneyDto() {}

    public Integer getNumber() {
        return number;
    }

    public BigDecimal getMoney() {
        return money;
    }
}