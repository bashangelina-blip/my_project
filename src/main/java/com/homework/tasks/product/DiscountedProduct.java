package com.homework.tasks.product;

public class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String name, double price, boolean isInStock) {
        super(name, price, isInStock);
    }

    public DiscountedProduct(String name, double price, boolean isInStock, double discount) {
        super(name, price, isInStock);
        setDiscount(discount);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount < 0 || discount >= 100){
            throw new IllegalArgumentException("Некоректна знижка");
        }
        this.discount = discount;
    }

    public double getDiscountedPrice(){
        return getPrice()*(1-discount/100);
    }

    @Override
    public String toString() {
        double discountedPrice = getDiscountedPrice();
        return "Product: " + getName() + " - " + discountedPrice + "$ " +
                (isInStock() ? "is in stock" : "is out of stock") +
                " (discount: " + discount + "%)";
    }

    }

