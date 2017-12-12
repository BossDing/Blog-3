package com.beautifulsoup.controller;

import com.beautifulsoup.bean.db.Category;
import com.beautifulsoup.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "/update")
    public String updateCategory(@RequestParam("id")Integer id,Model model){
        Category category=categoryService.findCategoryById(id);
        if (null!=category){
            model.addAttribute("category",category);
        }
        return "manage/manage-category-update";
    }

}
