package com.homework;

public class TaskTwoSwitchCycle {
    public static void main(String[] args) {
        String dayOfTheWeek = args[0];
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday" -> System.out.println("This is the first day of the week");
            case "tuesday" -> System.out.println("This is the second day of the week");
            case "wednesday" -> System.out.println("This is the third day of the week");
            case "thursday" -> System.out.println("This is the fourth day of the week");
            case "friday" -> System.out.println("This is the fifth day of the week");
            case "saturday", "sunday" -> System.out.println("Finally, weekend");
            default -> System.out.println("Invalid");
        }
    }
}
