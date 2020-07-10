package com.zw.food.dao;

import com.zw.food.daomain.Carousel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarouselRepository extends JpaRepository<Carousel,String> {

    List<Carousel> findAllByIsShow(Integer isShow);


}
