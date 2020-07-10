package com.zw.food.service;

import com.zw.food.daomain.Carousel;

import java.util.List;

public interface CarouselService {

    public List<Carousel> queryAll(Integer isShow);

}
