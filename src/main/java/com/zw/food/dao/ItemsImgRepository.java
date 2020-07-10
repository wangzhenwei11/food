package com.zw.food.dao;


import com.zw.food.daomain.ItemsImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsImgRepository extends JpaRepository<ItemsImg, String> {
}
