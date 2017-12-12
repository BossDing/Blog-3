package com.beautifulsoup.service.impl;

import com.beautifulsoup.bean.db.Category;
import com.beautifulsoup.mapper.CategoryMapper;
import com.beautifulsoup.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/12/8.
 */
@Transactional
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public int insert(Category record) {
        return categoryMapper.insert(record);
    }

    @Override
    public int insertSelective(Category record) {
        return categoryMapper.insertSelective(record);
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryMapper.findAllCategories();
    }

    @Override
    public Category findCategoryById(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }


}
