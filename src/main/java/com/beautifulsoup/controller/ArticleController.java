package com.beautifulsoup.controller;

import com.beautifulsoup.bean.db.Article;
import com.beautifulsoup.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/12/8.
 */
@RequestMapping("/article")
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/listall")
    public String listAllArticles(Model model){

        int totalPage=articleService.getArticlesCount();

        List<Article> articles=articleService.listArticlesByPage(0);

        model.addAttribute("articles",articles);

        model.addAttribute("totalPage",totalPage);
        return "manage/manage-article";
    }

    @RequestMapping(value = "/listbypage")
    public String listArticlesByPage(Model model, @RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum){
        List<Article> articles=articleService.listArticlesByPage(pageNum);
        model.addAttribute("articles",articles);
        return "manage/manage-article";
    }
}
