package com.shoppingcart.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.app.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
	

}
