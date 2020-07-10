package com.zw.food.dao;

import com.zw.food.daomain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,String> {
}
