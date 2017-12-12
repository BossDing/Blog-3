package com.beautifulsoup.mapper;

import com.beautifulsoup.bean.db.Article;
import com.beautifulsoup.bean.db.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleMapper {

    List<Article> findAllArticles();
    int insertArticle(Article article);
    List<Article> listArticlesByPage(Integer pageNum);
    int getArticlesCount();
    Article selectArticleById(Integer id);
}