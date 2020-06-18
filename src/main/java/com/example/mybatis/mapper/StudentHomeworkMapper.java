package com.example.mybatis.mapper;

import com.example.mybatis.model.StudentHomework;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


@Mapper
public interface StudentHomeworkMapper {
    @Insert("INSERT INTO s_student_homework(student_id,homework_id,homework_title,homework_content,create_time) " +
            "values (#{student_id},#{homework_id},#{homework_title},#{homework_content},#{create_time})")
    boolean addHomework(StudentHomework sh);

    @Update("update s_student_homework set homework_title=#{homework_title},homework_content=#{homework_content} where student_id=#{student_id} AND homework_id=#{homework_id}")
    boolean updateHomework(StudentHomework sh);

    @Select("select * from s_student_homework")
    List<StudentHomework> selectAll1();
}

