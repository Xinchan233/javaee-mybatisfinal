package com.example.mybatis.model;



import java.util.Date;

/**

 * StudentHomework 数据层，与数据的映射关系
 * 学生提交的作业

 */

public class StudentHomework {
    private Long id;
    private Long student_id;
    private Long homework_id;
    private String homework_title;
    private String homework_content;
    private Date create_time;
    private Date updateTime;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getStudentId() { return student_id; }

    public void setStudentId(Long studentId) {
        this.student_id = studentId;
    }

    public Long getHomeworkId() {
        return homework_id;
    }

    public void setHomeworkId(Long homeworkId) {
        this.homework_id = homeworkId;
    }

    public String getHomeworkTitle() {
        return homework_title;
    }

    public void setHomeworkTitle(String homeworkTitle) {
        this.homework_title = homeworkTitle;
    }

    public String getHomeworkContent() {
        return homework_content;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homework_content = homeworkContent;
    }

    public Date getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Date createTime) {
        this.create_time = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}