package com.homework.OOP.ClassesAndObjects;

public enum Size {
    VERY_SMALL("XS"), SMALL("S"),
    AVERAGE("M"), BIG("L"), VERY_BIG("XL"), UNDEFINED("");

    Size(String Abbreviation) {
    }

    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }
}

