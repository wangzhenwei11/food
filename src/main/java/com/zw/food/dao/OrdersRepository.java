package com.zw.food.dao;


import com.zw.food.daomain.Orders;
import com.zw.food.daomain.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
