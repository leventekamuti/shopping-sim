package com.tms.Promotions;

import com.tms.Product;

import java.util.List;

public class PromotionED implements Promotion{
    @Override
    public double applyPromotion(List<Product> products, double sum) {
        boolean contains_e = false;
        boolean contains_d = false;
        for (Product i : products){
            if (!contains_e && i.getName().equals("E")) contains_e = true;
            if (!contains_d && i.getName().equals("D")) contains_d = true;
            if (contains_e && contains_d) return sum * 0.3;
        }
     return 0;
    }
}
