package com.beautifulsoup.mapper.category;

import com.beautifulsoup.BlogApplicationTests;
import com.beautifulsoup.mapper.CategoryMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by BeautifulSoup on 2017/12/12.
 */
public class CategoryMapperTest extends BlogApplicationTests {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void testDeleteCategoriesCustom(){
        categoryMapper.deleteArticleByCategoryId(6);
    }
}
