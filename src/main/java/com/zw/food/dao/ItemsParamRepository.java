package com.zw.food.dao;


import com.zw.food.daomain.ItemsParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface ItemsParamRepository extends JpaRepository<ItemsParam, String> {
}
