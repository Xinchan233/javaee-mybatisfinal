package com.example.mybatis.model;


import java.util.Date;

/**

 * StudentHomework 数据层，与数据的映射关系
 * 老师布置添加的作业

 */

public class Homework {
    private Long id;
    private Long num;
    private String name;
    private String title;
    private String content;
    private Date create_time;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeworkTitle() {
        return title;
    }

    public void setHomeworkTitle(String title) { this.title = title; }

    public String getHomeworkContent() {
        return content;
    }

    public void setHomeworkContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
