package com.example.mybatis.dao;

import com.example.mybatis.model.Homework;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface HomeworkMapper {
    @Insert("INSERT INTO s_homework(title,content,create_time) VALUE(#{title},#{content},#{create_time})")
    boolean addHomework(Homework h);
    @Update("update s_homework set content=#{content} where title=#{title}")
    boolean updateHomework(Homework h);
    @Select("select * from s_homework")
    List<Homework> selectAll3();
}
