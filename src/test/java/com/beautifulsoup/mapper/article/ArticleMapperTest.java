package com.beautifulsoup.mapper.article;

import com.beautifulsoup.BlogApplicationTests;
import com.beautifulsoup.bean.vo.ArticleCustom;
import com.beautifulsoup.mapper.ArticleMapper;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by BeautifulSoup on 2017/12/12.
 */
public class ArticleMapperTest extends BlogApplicationTests {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void testFindArticleCustom(){
        ArticleCustom articleCustom=articleMapper.findArticleCustomById(11);
        System.out.println(ReflectionToStringBuilder.toString(articleCustom, ToStringStyle.MULTI_LINE_STYLE));
    }
}
