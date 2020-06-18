package com.example.mybatis.dao;


import com.example.mybatis.model.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
@Mapper
public interface TeacherMapper {
    @Select("SELECT * FROM s_teacher where id=#{id} and pw=#{pw}" )
    List<Teacher> find4(@Param("id") Long id, @Param("pw") String pw);

    @Insert("INSERT INTO s_student(id,pw) VALUES (#{id},#{pw})")
    boolean addteacher(Teacher t);
}
