package com.beautifulsoup.bean.vo;

import com.beautifulsoup.bean.db.Article;
import com.beautifulsoup.bean.db.Category;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by BeautifulSoup on 2017/12/12.
 */
public class CategoryCustom extends Category {
    //得到当前分类下的所有文章列表
    private Set<Article> articleSet=new HashSet<>();

    public Set<Article> getArticleSet() {
        return articleSet;
    }

    public void setArticleSet(Set<Article> articleSet) {
        this.articleSet = articleSet;
    }
}
