package com.beautifulsoup.service;

import com.beautifulsoup.bean.db.Category;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/12/8.
 */
public interface CategoryService {
    int insert(Category record);
    int insertSelective(Category record);
    List<Category> findAllCategories();
    Category findCategoryById(Integer id);
}
