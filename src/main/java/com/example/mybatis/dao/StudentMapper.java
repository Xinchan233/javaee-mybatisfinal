package com.example.mybatis.dao;

import com.example.mybatis.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM s_student where id=#{studentId} and pw=#{pw}" )
    List<Student> find2(@Param("studentId") Long studentId, @Param("pw") String pw);

    @Insert("INSERT INTO s_student(id,name,pw) VALUES (#{id},#{name},#{pw})")
    boolean addstudent(Student s);
}
