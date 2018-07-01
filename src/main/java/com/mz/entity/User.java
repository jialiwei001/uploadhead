package com.mz.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mz
 * @Description：用户类
 * @date 2018/7/1
 * @time 8:55
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    private String uid;

    private String avatar;

    public User() {
    }

    public User(String uid, String username, String password, String avatar) {
        this.uid = uid;
        this.avatar = avatar;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
