package com.zw.food.controller;

import com.zw.food.common.enums.YesOrNo;
import com.zw.food.common.utils.IMOOCJSONResult;
import com.zw.food.daomain.Carousel;
import com.zw.food.service.CarouselService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/index")
public class IndexController {

    private CarouselService carouselService;

    @GetMapping("carousel")
    public IMOOCJSONResult carousel() {
        List<Carousel> carousels = carouselService.queryAll(YesOrNo.YES.getType());
        return IMOOCJSONResult.ok(carousels);
    }
}
