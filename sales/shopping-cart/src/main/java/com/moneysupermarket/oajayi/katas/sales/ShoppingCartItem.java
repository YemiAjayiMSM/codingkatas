package com.moneysupermarket.oajayi.katas.sales;

/**
 * Created with IntelliJ IDEA.
 * User: opeyemi.ajayi
 * Date: 28/02/14
 * Time: 12:08
 * To change this template use File | Settings | File Templates.
 */
public class ShoppingCartItem {

    private ShoppingCartItemTypes itemType;
    private double price;

    public void setType(ShoppingCartItemTypes type) {
        this.itemType = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ShoppingCartItemTypes getType() {
        return this.itemType;
    }

    public double getPrice() {
        return this.price;
    }
}
