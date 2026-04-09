package com.homework.javaHomework;

import java.util.ArrayList;

public class Massyv {
    public static void main(String[] args) {
        String[] students = {"Anna M", "Maria S", "Mykola S", "Dmytro K", "Grygorii K"};

        for(String student: students){
            System.out.println(student);
        }
        System.out.println();

        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Maria Ivanivna");
        teachers.add("Olha Mykolaivna");
        teachers.add("Olha Viktorivna");
        teachers.add("Dmytro Petrovych");

        for(String teacher: teachers){
            System.out.println(teacher);
        }
    }

}


