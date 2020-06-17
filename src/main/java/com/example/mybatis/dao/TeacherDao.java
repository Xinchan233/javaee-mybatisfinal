package com.example.mybatis.dao;


import com.example.mybatis.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

@Mapper
public interface TeacherDao {
    List<Teacher> find4(@Param("id") Long id, @Param("pw") String pw);
    boolean addteacher(Teacher t);
}
