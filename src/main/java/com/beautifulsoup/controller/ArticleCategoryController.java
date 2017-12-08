package com.beautifulsoup.controller;

import com.beautifulsoup.bean.db.Category;
import com.beautifulsoup.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/12/8.
 */
@RequestMapping(value = "/category")
@Controller
public class ArticleCategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/listall")
    public String listAllCategories(Model model){
        List<Category> categories=categoryService.findAllCategories();
        model.addAttribute("categories",categories);
        return "manage/manage-category";
    }

}
