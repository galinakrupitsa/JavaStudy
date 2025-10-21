package org.example.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class DTO {
    String type;
    int amount;
    public DTO(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getAmount() {
        return amount;

    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}