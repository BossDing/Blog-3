package com.beautifulsoup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BeautifulSoup on 2017/12/12.
 */
@Controller
@RequestMapping("/about")
public class AboutController {


    @RequestMapping("/creator")
    public String aboutUs(){
        return "manage/manage-aboutus";
    }


}
