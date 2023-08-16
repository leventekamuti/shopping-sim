package com.tms.Promotions;

import com.tms.Product;
import com.tms.Shop;

import java.util.List;

public class PromotionD implements Promotion{
    @Override
    public double applyPromotion(List<Product> products, double sum) {
        int cnt_d = 0;
        for (Product i : products){
            if (i.getName().equals("D")) cnt_d++;
        }
        return -1 * Shop.getItemPrice("D") * (int) (cnt_d / 3);
    }
}
