package com.example.mybatis.dao;

import com.example.mybatis.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentDao {
    List<Student> find2(@Param("studentId") Long studentId, @Param("pw") String pw);
    boolean addstudent(Student s);
}
