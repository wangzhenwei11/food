package com.zw.food.service.impl;

import com.zw.food.dao.CategoryRepository;
import com.zw.food.daomain.Carousel;
import com.zw.food.daomain.Category;
import com.zw.food.pojo.vo.RootCatVO;
import com.zw.food.pojo.vo.SubCategoryVO;
import com.zw.food.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Category> queryAllRootLevelCat() {

        return categoryRepository.findAllByType(1);
    }

    @Override
    public List<RootCatVO> getSubCatList(Integer id) {


        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT\n" +
                "\tf.id AS id,\n" +
                "\tf. name  AS  name ,\n" +
                "\tf.type AS type,\n" +
                "\tf.father_id AS fatherId,\n" +
                "\tc.id AS subId,\n" +
                "\tc. name  AS subName,\n" +
                "\tc.type AS subType,\n" +
                "\tc.father_id AS subFatherId \n" +
                "FROM\n" +
                "\tcategory f\n" +
                "\tLEFT JOIN category c ON f.id = c.father_id \n" +
                "WHERE\n" +
                "\tf.father_id = " + id);

        List<RootCatVO> rootCatVOS = new ArrayList<>();
        maps.forEach(v -> {
            RootCatVO rootCatVO = new RootCatVO();

            rootCatVO.setId(((Integer) v.get("id")));
            rootCatVO.setName(((String) v.get("name")));
            rootCatVO.setType(((Integer) v.get("type")));
            rootCatVO.setFatherId(((Integer) v.get("fatherId")));
            rootCatVO.setSubFatherId(((Integer) v.get("subFatherId")));
            rootCatVO.setSubType(((Integer) v.get("subType")));
            rootCatVO.setSubName(((String) v.get("subName")));
            rootCatVO.setSubId(((Integer) v.get("subId")));
            rootCatVOS.add(rootCatVO);
        });
        Map<Integer, List<RootCatVO>> map = rootCatVOS.stream().collect(Collectors.groupingBy(RootCatVO::getId));
        rootCatVOS.clear();


        map.forEach((k,v) ->{
            RootCatVO rootCatVO = new RootCatVO();
            List<SubCategoryVO> subCategoryVOS = new ArrayList<>();
            rootCatVO.setId(v.get(0).getId());
            rootCatVO.setName(v.get(0).getName());
            rootCatVO.setType(v.get(0).getType());
            rootCatVO.setFatherId(v.get(0).getFatherId());
            v.forEach(va ->{
                SubCategoryVO subCategoryVO = new SubCategoryVO();
                subCategoryVO.setSubFatherId(va.getSubFatherId());
                subCategoryVO.setSubType(va.getSubType());
                subCategoryVO.setSubName(va.getSubName());
                subCategoryVO.setSubId(va.getSubId());
                subCategoryVOS.add(subCategoryVO);
            });
            rootCatVO.setSubCategoryVOS(subCategoryVOS);
            rootCatVOS.add(rootCatVO);
        });

        return rootCatVOS;
    }
}
