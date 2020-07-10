package com.zw.food.dao;

import com.zw.food.daomain.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository  extends JpaRepository<UserAddress,String> {
}
