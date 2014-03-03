package com.moneysupermarket.oajayi.katas.sales;

import com.sun.xml.internal.ws.api.server.ServerPipelineHook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: opeyemi.ajayi
 * Date: 28/02/14
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public class ShoppingCartTests {

    private ShoppingCart myCart;

    @Before
    public void testSetup(){
        this.myCart = new ShoppingCart();
    }

    @Test
    public void shouldTestThatShoppingCartCanAdd1Item(){

        ShoppingCartItem myItem = new ShoppingCartItem();

        myCart.add(myItem);

        Assert.assertEquals("Expected 1", 1, myCart.getItemCount());
    }


    @Test
    public void shouldTestThatShoppingCartCanAdd2Items(){
        ShoppingCartItem myFirstItem = new ShoppingCartItem();
        ShoppingCartItem mySecondItem = new ShoppingCartItem();

        myCart.add(myFirstItem);
        myCart.add(mySecondItem);

        Assert.assertEquals("Expected 2", 2, myCart.getItemCount());
    }

    @Test
    public void shouldTestThatShoppingCartCanAdd1BookAt12_49(){
        ShoppingCartItem myItem = new ShoppingCartItem();

        myItem.setType(ShoppingCartItemTypes.BOOK);
        myItem.setPrice(12.49);

        myCart.add(myItem);

        Assert.assertEquals(ShoppingCartItemTypes.BOOK, myItem.getType());
        Assert.assertEquals(12.49, myCart.getTotalCost(), 0);
    }

    @Test
    public void shouldTestThatShoppingCartCanAdd2BooksAt12_49(){
        ShoppingCartItem firstItem = new ShoppingCartItem();
        ShoppingCartItem secondItem = new ShoppingCartItem();

        firstItem.setType(ShoppingCartItemTypes.BOOK);
        firstItem.setPrice(12.49);
        secondItem.setType(ShoppingCartItemTypes.BOOK);
        secondItem.setPrice(12.49);

        myCart.add(firstItem);
        myCart.add(secondItem);

        Assert.assertEquals(ShoppingCartItemTypes.BOOK, firstItem.getType());
        Assert.assertEquals(ShoppingCartItemTypes.BOOK, secondItem.getType());
        Assert.assertEquals(2, myCart.getItemCount());
        Assert.assertEquals(24.98, myCart.getTotalCost(), 0);

    }
}
