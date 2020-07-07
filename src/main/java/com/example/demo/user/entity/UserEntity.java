package com.example.demo.user.entity;

import java.util.Date;

public class UserEntity {
    private Integer id;
    private String name;
    private String sex;
    private String tel;
    private Date birthday;
    private String synopsis;

    public UserEntity() {

    }

    public UserEntity(Integer id, String name, String sex, String tel, Date birthday, String synopsis) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.tel = tel;
        this.birthday = birthday;
        this.synopsis = synopsis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getsynopsis() {
        return synopsis;
    }

    public void setsynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", birthday=" + birthday +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }
}
