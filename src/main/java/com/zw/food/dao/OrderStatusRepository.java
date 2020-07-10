package com.zw.food.dao;


import com.zw.food.daomain.OrderStatus;
import com.zw.food.daomain.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer> {
}
