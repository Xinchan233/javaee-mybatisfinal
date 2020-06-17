package com.example.mybatis.service;

import com.example.mybatis.model.Homework;
import com.example.mybatis.model.Student;
import com.example.mybatis.model.StudentHomework;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface AllSService {

    boolean login(HttpServletRequest req);
    boolean addHomework(HttpServletRequest req);

    boolean updateHomework(HttpServletRequest req);
    boolean addstudent(HttpServletRequest req);


}
