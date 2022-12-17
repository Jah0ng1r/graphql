package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Rating {
    FIVE_STARTS("*****"),
    FOUR_STARTS("****"),
    THREE_STARTS("***"),
    TWO_STARTS("**"),
    ONE_STARTS("*");
    private String star;

    Rating(String star) {
        this.star = star;
    }

    @JsonValue
    public String getStar() {
        return star;
    }
}
