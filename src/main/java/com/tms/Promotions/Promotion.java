package com.tms.Promotions;

import com.tms.Product;

import java.util.List;

public interface Promotion {
    double applyPromotion(List<Product> products, double sum); // sum az ED szabály miatt kell
}
