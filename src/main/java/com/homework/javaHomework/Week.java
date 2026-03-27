package com.homework.javaHomework;

import java.util.Locale;
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        System.out.println("Enter day of the week");
        Scanner d = new Scanner(System.in);
        String day = d.nextLine().trim().toLowerCase();

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day.toUpperCase(Locale.ROOT) + " is a working day");
                break;
            case "saturday":
            case "sunday":
                System.out.println(day.toUpperCase(Locale.ROOT) + " is a weekend");
                break;
            default:
                System.out.println("Not a day of the week");
                break;

        }
    }
}
