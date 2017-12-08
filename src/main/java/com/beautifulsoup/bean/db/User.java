package com.beautifulsoup.bean.db;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String avatar;
    private String description;
    private Integer follow;
    private Integer followed;
    private String phone;
    private String address;
    private Set<Role> roles=new HashSet<>();

    public User() {
    }

    public User(String username, String password, String avatar, String description, Integer follow, Integer followed, String phone, String address) {
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.description = description;
        this.follow = follow;
        this.followed = followed;
        this.phone = phone;
        this.address = address;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFollow() {
        return follow;
    }

    public void setFollow(Integer follow) {
        this.follow = follow;
    }

    public Integer getFollowed() {
        return followed;
    }

    public void setFollowed(Integer followed) {
        this.followed = followed;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", description='" + description + '\'' +
                ", follow=" + follow +
                ", followed=" + followed +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", roles=" + roles +
                '}';
    }
}
