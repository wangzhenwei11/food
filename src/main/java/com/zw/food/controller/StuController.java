package com.zw.food.controller;

import com.zw.food.daomain.Stu;
import com.zw.food.service.StuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StuController {

    @Resource
    private StuService stuService;

    @GetMapping("save")
    public int saveStu(){

        Stu stu = new Stu();
        stu.setId(5);
        stu.setAge(1);
        stu.setName("1");
        stuService.insert(stu);

        return 1;
    }

}
