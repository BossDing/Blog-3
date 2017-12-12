package com.beautifulsoup.service.impl;

import com.beautifulsoup.bean.db.Article;
import com.beautifulsoup.mapper.ArticleMapper;
import com.beautifulsoup.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/12/8.
 */
@Transactional
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> findAllArticles() {
        return articleMapper.findAllArticles();
    }

    @Override
    public int getArticlesCount() {
        int count=articleMapper.getArticlesCount();
        int result=1;
        if (count%4==0){
            result=count/4;
        }else{
            result=count/4+1;
        }
        return result;
    }

    @Override
    public int insertArticle(Article article) {
        return articleMapper.insertArticle(article);
    }

    @Override
    public List<Article> listArticlesByPage(Integer pageNum) {
       int pageNumCount=(pageNum-1)*4;
       return articleMapper.listArticlesByPage(pageNumCount);
    }

    @Override
    public Article findArticleById(Integer id) {
        return articleMapper.selectArticleById(id);
    }

}
