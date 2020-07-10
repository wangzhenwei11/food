package com.zw.food.service.impl;

import com.zw.food.dao.StuRepository;
import com.zw.food.daomain.Stu;
import com.zw.food.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StuServiceiLmpl implements StuService {

    @Resource
    private StuRepository stuRepository;

    @Override
    public void insert(Stu stu) {
        Stu save = stuRepository.save(stu);

        System.out.println(save);
    }
}
