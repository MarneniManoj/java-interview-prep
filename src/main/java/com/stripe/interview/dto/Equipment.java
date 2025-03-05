package com.stripe.interview.dto;

import java.io.Serializable;

public class Equipment implements Serializable {
    String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
