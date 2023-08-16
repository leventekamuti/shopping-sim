package com.tms;

import com.tms.Promotions.Promotion;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static List<Product> products = null;
    private final List<Promotion> promotions;

    public Shop(List<Promotion> promotions) {
        this.promotions = promotions;
        products = new ArrayList<>();
        addPreDefinedProducts();
    }

    private void addPreDefinedProducts() {
        products.add(new Product("A", 55));
        products.add(new Product("B", 20));
        products.add(new Product("C", 60));
        products.add(new Product("D", 10));
        products.add(new Product("E", 45));
    }

    public void addProduct(String name, double price){
        products.add(new Product(name, price));
    }

    public static double getItemPrice(String name){
        for (Product i : products){
            if (i.getName().equals(name)) return i.getPrice();
        }
        return 0; // Ha nem található ilyen item
    }

    public double calculateTotal(List<Product> cart){
        double sum = 0;
        
        for (Product i : cart){
            sum += i.getPrice();
        }

        // Promóciók alkalmazása
        for (Promotion i : promotions){
            sum += i.applyPromotion(cart, sum);
        }

        return sum;
    }
}
