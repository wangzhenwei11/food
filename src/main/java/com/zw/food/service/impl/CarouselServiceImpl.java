package com.zw.food.service.impl;

import com.zw.food.dao.CarouselRepository;
import com.zw.food.daomain.Carousel;
import com.zw.food.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselRepository carouselRepository;

    @Override
    public List<Carousel> queryAll(Integer isShow) {

        List<Carousel> carousels = carouselRepository.findAllByIsShow(isShow);

        return carousels;
    }
}
