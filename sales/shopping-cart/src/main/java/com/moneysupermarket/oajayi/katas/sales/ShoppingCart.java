package com.moneysupermarket.oajayi.katas.sales;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: opeyemi.ajayi
 * Date: 28/02/14
 * Time: 12:06
 * To change this template use File | Settings | File Templates.
 */
public class ShoppingCart {

    private List<ShoppingCartItem> shoppingCartItems = new ArrayList<ShoppingCartItem>();

    public void add(ShoppingCartItem myItem) {
        shoppingCartItems.add(myItem);
    }

    public int getItemCount() {
        return shoppingCartItems.size();
    }

    public double getTotalCost() {

        double totalCost = 0;

        for(ShoppingCartItem cartItem: shoppingCartItems){
            totalCost+= cartItem.getPrice();
        }

        return totalCost;
    }
}
