package com.homework.tasks.product;

import java.util.ArrayList;
import java.util.HashMap;

public class MainProducts {
    public static void main(String[] args) {
        Product computer = new Product("Lenovo", 2300, true);
        Product phone = new Product("Nokia", 300, false);

        System.out.println(computer);
        System.out.println(phone);

        Product computer1 = new DiscountedProduct("ASUS", 0, true, 90);
        System.out.println(computer1);

        ArrayList<Product>products = new ArrayList<>();
        products.add(computer);
        products.add(phone);
        products.add(computer1);

        for(Product product:products){
            System.out.println(product);
        }

    }
}
