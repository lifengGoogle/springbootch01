package com.lifeng.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 用户表
 * @author fengli
 * @version 1.0
 * @date 2020/12/05
 */
@Table(name = "userlogin")
@Entity
public class User {
    @Id
    private String userID;//主键ID
    private String username;//用户名
    private String password;//密码

    public User() {
    }

    public User(String userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
