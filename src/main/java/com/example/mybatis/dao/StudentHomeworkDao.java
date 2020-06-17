package com.example.mybatis.dao;

import com.example.mybatis.model.StudentHomework;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface StudentHomeworkDao {

    boolean addHomework(StudentHomework sh);
    boolean updateHomework(StudentHomework sh);
    List<StudentHomework> selectAll1();
}

