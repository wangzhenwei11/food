package com.zw.food.service.impl;

import com.zw.food.dao.CarouselRepository;
import com.zw.food.daomain.Carousel;
import com.zw.food.service.CarouselService;

import javax.annotation.Resource;
import java.util.List;

public class CarouselServiceImpl implements CarouselService {

    @Resource
    private CarouselRepository carouselRepository;

    @Override
    public List<Carousel> queryAll(Integer isShow) {

        List<Carousel> carousels = carouselRepository.findAllByIsShow(isShow);

        return carousels;
    }
}
