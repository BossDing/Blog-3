package com.beautifulsoup.service.category;

import com.beautifulsoup.BlogApplicationTests;
import com.beautifulsoup.bean.db.Category;
import com.beautifulsoup.service.CategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by BeautifulSoup on 2017/12/8.
 */
public class CategoryServiceTest extends BlogApplicationTests{

    @Autowired
    private CategoryService categoryService;

    @Test
    public void insertCategories(){
        Category category1=new Category(2,"前端","这里汇集了各种前端知识,不论是常用的HTML5+CSS3+JavaScript+Jquery,你还可以看到这里有各种前端的模块化组件化解决方案Vue,Angular,React" +
                ",有我们社区的大力支持,你可以参加各种的线上线下活动,你可以向我们提交您的所见所想,为前端开发群策群力!");
        Category category2=new Category(3,"Android","关于Android的各种技术博文,无论是从应用层还是Framework层,你都可以领略到移动应用的开发的魅力。同时我们会不定期的推送关于大厂对Android的开发相关技术,来到这里你一定不会失望");

        Category category3=new Category(4,"IOS","关于IOS，IOS很贵,入门的门槛高,首先你要有一台Mac!");

        Category category4=new Category(5,"人工智能","AI火了,无论在哪里你都会看到各种机器学习的影子,其实你也不用担心,万事万物皆有其规律,早晚人工智能也会有市场爆冷门的时候!");

        Category category5=new Category(6,"设计","主要是妹子玩的!");

        categoryService.insert(category1);
        categoryService.insert(category2);
        categoryService.insert(category3);
        categoryService.insert(category4);
        categoryService.insert(category5);
    }


}
