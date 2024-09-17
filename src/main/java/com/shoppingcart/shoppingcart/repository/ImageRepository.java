package com.shoppingcart.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.shoppingcart.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
        
}
