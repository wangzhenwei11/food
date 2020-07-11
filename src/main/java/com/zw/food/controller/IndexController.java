package com.zw.food.controller;

import com.zw.food.common.enums.YesOrNo;
import com.zw.food.common.utils.IMOOCJSONResult;
import com.zw.food.daomain.Carousel;
import com.zw.food.service.CarouselService;
import com.zw.food.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/index")
public class IndexController {

    @Resource
    private CarouselService carouselService;

    @Resource
    private CategoryService categoryService;


    @GetMapping("carousel")
    public IMOOCJSONResult carousel() {
        List<Carousel> carousels = carouselService.queryAll(YesOrNo.YES.getType());
        return IMOOCJSONResult.ok(carousels);
    }

    @GetMapping("/cats")
    public IMOOCJSONResult cats() {
        return IMOOCJSONResult.ok(categoryService.queryAllRootLevelCat());
    }

    @GetMapping("/querySubCatList")
    public IMOOCJSONResult querySubCatList() {
        return IMOOCJSONResult.ok(categoryService.getSubCatList(1));
    }



}
