package com.homework.oop.classes_and_objects;

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

