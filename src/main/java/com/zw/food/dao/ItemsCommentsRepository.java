package com.zw.food.dao;


import com.zw.food.daomain.ItemsComments;
import com.zw.food.daomain.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsCommentsRepository extends JpaRepository<ItemsComments, String> {
}
