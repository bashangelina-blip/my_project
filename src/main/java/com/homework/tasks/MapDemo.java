package com.homework.tasks;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Lenovo", 2345.0);
        products.put("ASUS", 4500.0);
        products.put("Legion", 2000.0);

        for(Map.Entry<String,Double> entry : products.entrySet()){
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }


    }
}
