package com.beautifulsoup.bean.vo;

import com.beautifulsoup.bean.db.Article;
import com.beautifulsoup.bean.db.User;

/**
 * Created by BeautifulSoup on 2017/12/12.
 */
public class ArticleCustom extends Article{
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
