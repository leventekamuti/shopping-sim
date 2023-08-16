package com.tms;

import com.tms.Promotions.Promotion;
import com.tms.Promotions.Promotion2A1C;
import com.tms.Promotions.PromotionD;
import com.tms.Promotions.PromotionED;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Promotion> promotions = List.of(new PromotionD(), new Promotion2A1C(), new PromotionED()); // PromotionED szabálynak utolsónak kell lennie,
                                                                                                        // mivel közvetlenül a végösszeget befolyásolja
        Shop session = new Shop(promotions);

        List<Product> cart = fixInput(args);

        printCartTotal(cart, session);
    }

    // Példainput: ["A", "A", "B"], mivel parancssori argumentum, ezért a szóközök mentén fel lesz darabolva alapból
    // (pl. args[0] -> ["A", ; args[1] ->  "A", ; args[2] -> "B"])
    // Az alábbi fv. így megfelelő formára hozza
    static List<Product> fixInput(String[] args){
        List<Product> list = new ArrayList<>();
        for (String s : args){
            String name = s.replaceAll("[\\[\\]\",]", "");
            list.add(new Product(name, Shop.getItemPrice(name)));
        }
        return list;
    }

    private static void printCartTotal(List<Product> cart, Shop session){
        System.out.println("Vasarolt termekek: ");
        System.out.println(cart.stream().map(Product::getName).collect(Collectors.joining(", ")));
        System.out.print("Vegosszeg: " + session.calculateTotal(cart));
    }
}
