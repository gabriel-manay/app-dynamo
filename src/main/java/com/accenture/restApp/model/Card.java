package com.accenture.restApp.model;

import java.io.Serializable;

public class Card implements Serializable {

    private String bank;
    private String cardNumber;
    private String valid;

    public Card() {
    }

    public Card(String bank, String cardNumber) {
        this.bank = bank;
        this.cardNumber = cardNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Card{" +
                "bank='" + bank + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", valid='" + valid + '\'' +
                '}';
    }
}
