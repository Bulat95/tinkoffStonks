package com.example.microstinkoff.model;

public enum Currency {
    RUB("RUB"),
    USD("USD"),
    EUR("EUR"),
    GBP("GBP");

    private String currency;

    Currency(String currency){
        this.currency = currency;
    }
}
