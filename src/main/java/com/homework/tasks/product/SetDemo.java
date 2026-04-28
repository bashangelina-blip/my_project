package com.homework.tasks.product;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> categories = new HashSet<>();
        categories.add("Electronic");
        categories.add("Clothes");
        categories.add("Computers");

        boolean hasClothes = categories.stream()
                .anyMatch(c -> c.equalsIgnoreCase("clothes"));

        if(hasClothes){
            System.out.println("Category 'clothes' is in categories");
        }else{
            System.out.println("It's not here");
        }
    }

}


