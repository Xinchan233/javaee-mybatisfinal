package com.example.mybatis.service;

import com.example.mybatis.model.Homework;
import com.example.mybatis.model.Student;
import com.example.mybatis.model.StudentHomework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface AllTService {
    boolean login (HttpServletRequest req);
    boolean addHomework(HttpServletRequest req);
    List<Homework> selectAll3();
    List<StudentHomework> selectAll1();
    boolean addteacher(HttpServletRequest req);

}
