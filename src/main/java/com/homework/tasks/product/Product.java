package com.homework.tasks.product;

import com.homework.tasks.exception.InvalidPriceException;

public class Product {
    private String name;
    private double price;
    private boolean isInStock;

    public Product(String name, double price, boolean isInStock) {
        this.name = name;
        setPrice(price);
        this.isInStock = isInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new InvalidPriceException("Ціна не може бути менше нуля");
        }
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }


    public void printInfo(){
        if (isInStock){
            System.out.println("Product: " + name+ " - "+price+"$ is in stock");
        }else{
            System.out.println("Product: " + name+ " - "+price+"$ is out of stock");
        }
    }
    @Override
    public String toString() {
        return "Product: " + name + " - " + price + "$ " +
                (isInStock ? "is in stock" : "is out of stock");
    }
}
