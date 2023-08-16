package com.tms.Promotions;

import com.tms.Product;
import com.tms.Shop;

import java.util.List;

public class Promotion2A1C implements Promotion{
    @Override
    public double applyPromotion(List<Product> products, double sum) {
        int cnt_a = 0;
        boolean contains_c = false;

        for (Product i : products){
            if (i.getName().equals("A")) cnt_a++;
            if (!contains_c && i.getName().equals("C")) contains_c = true;
        }
        // úgy értelmeztem, hogy pontosan 2 A termék esetén ("...Ha valaki kettő A terméket vásárol...")
        if (contains_c && cnt_a == 2) return -1 * Shop.getItemPrice("C") / 2;
        return 0;
    }
}
