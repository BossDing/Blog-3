package com.beautifulsoup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BeautifulSoup on 2017/12/8.
 */
@RequestMapping("/article")
@Controller
public class ArticleController {

    @RequestMapping(value = "listall")
    public String listAllArticles(){
        return "manage/manage-article";
    }
}
