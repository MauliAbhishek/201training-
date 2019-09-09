package com.shoppingcart.app.service;

import com.shoppingcart.app.exception.NotEnoughProductsInStockException;
import com.shoppingcart.app.model.Cart;
import com.shoppingcart.app.model.Product;


import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();
    //Start of my code 
    Cart saveCart(Cart cart);
    //End of my code
    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
