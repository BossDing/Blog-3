package com.beautifulsoup.controller;

import com.beautifulsoup.bean.db.Article;
import com.beautifulsoup.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @ModelAttribute("totalPage")
    public int totalPage(){
        int totalPage=articleService.getArticlesCount();
        return totalPage;
    }

    @RequestMapping(value = "/listall")
    public String listAllArticles(Model model){



        List<Article> articles=articleService.listArticlesByPage(1);

        model.addAttribute("articles",articles);

        return "manage/manage-article";
    }

    @RequestMapping(value = "/listbypage")
    public String listArticlesByPage(Model model, @RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum){
        List<Article> articles=articleService.listArticlesByPage(pageNum);
        model.addAttribute("articles",articles);
        return "manage/manage-article";
    }

    @RequestMapping(value = "/update")
    public String updateArticle(@RequestParam("id")Integer id,Model model){
        Article article=articleService.findArticleById(id);
        model.addAttribute("article",article);
        return "manage/manage-article-update";
    }

    @RequestMapping(value = "/add")
    public String addArticle(){
        return "manage/manage-article-add";
    }
    @RequestMapping(value = "/deletebyid",method = RequestMethod.POST)
    public String deleteArticle(@RequestParam("id")Integer id){
        articleService.deleteByPrimaryKey(id);
        return "manage/manage-article";
    }

    @RequestMapping(value = "/addarticle",method = RequestMethod.POST)
    public String addArticleSubmit(Article article,Model model){
        articleService.insertArticle(article);
        List<Article> articles=articleService.listArticlesByPage(1);

        model.addAttribute("articles",articles);

        return "manage/manage-article";
    }

    @RequestMapping(value = "/updatearticle",method = RequestMethod.POST)
    public String updateArticleSubmit(Article article,Model model){
        articleService.updateByPrimaryKey(article);
        List<Article> articles=articleService.listArticlesByPage(1);

        model.addAttribute("articles",articles);

        return "manage/manage-article";
    }
}
