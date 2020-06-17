package com.example.mybatis.dao;

import com.example.mybatis.model.Homework;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HomeworkDao {
    boolean addHomework(Homework h);
    List<Homework> selectAll3();
}
