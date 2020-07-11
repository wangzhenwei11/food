package com.zw.food.service;

import com.zw.food.daomain.Category;
import com.zw.food.pojo.vo.RootCatVO;

import java.util.List;
import java.util.Map;

public interface CategoryService {

    public List<Category> queryAllRootLevelCat();

    public List<RootCatVO> getSubCatList(Integer id);

}
