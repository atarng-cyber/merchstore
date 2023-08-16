package com.swift.merchstore.repository;

import com.swift.merchstore.model.Cart;
import com.swift.merchstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);

    void deleteByUser(User user);
}