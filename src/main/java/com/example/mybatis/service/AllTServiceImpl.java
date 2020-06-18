package com.example.mybatis.service;


import com.example.mybatis.dao.HomeworkMapper;
import com.example.mybatis.dao.StudentMapper;
import com.example.mybatis.dao.StudentHomeworkMapper;
import com.example.mybatis.dao.TeacherMapper;
import com.example.mybatis.model.Homework;
import com.example.mybatis.model.StudentHomework;
import com.example.mybatis.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
//@Transactional
public class AllTServiceImpl implements AllTService {
    @Resource
    private final HomeworkMapper homeworkMapper;
    private final StudentMapper studentMapper;
    private final StudentHomeworkMapper studentHomeworkMapper;
    private final TeacherMapper teacherMapper;

    @Autowired
    public AllTServiceImpl(HomeworkMapper homeworkMapper, StudentMapper studentMapper, StudentHomeworkMapper studentHomeworkMapper, TeacherMapper teacherMapper) {
        this.homeworkMapper = homeworkMapper;
        this.studentMapper = studentMapper;
        this.studentHomeworkMapper = studentHomeworkMapper;
        this.teacherMapper = teacherMapper;
    }

    @Override
    public boolean login(HttpServletRequest req) {
        Teacher t=new Teacher();
        t.setId(Long.parseLong(req.getParameter("id")));
        t.setPW(req.getParameter("pw"));
        System.out.println(t.getId()+"     "+t.getPW());
        List<Teacher> list= teacherMapper.find4(t.getId(),t.getPW());

        if(null == list || list.size() <= 0){
            return false;
        }else{
            return true;
        }

    }


    @Override
    public boolean addHomework(HttpServletRequest req) {
        Homework h = new Homework();
        h.setHomeworkTitle(req.getParameter("hwname"));
        h.setHomeworkContent(req.getParameter("content"));
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        h.setCreateTime(date);
        return homeworkMapper.addHomework(h);
    }

    @Override
    public boolean updatehomework(HttpServletRequest req) {
        Homework h = new Homework();
        h.setHomeworkTitle(req.getParameter("hwname"));
        h.setHomeworkContent(req.getParameter("content"));
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        h.setCreateTime(date);
        return homeworkMapper.updateHomework(h);
    }

    @Override
    public boolean addteacher(HttpServletRequest req) {
        Teacher t = new Teacher();
        t.setId(Long.parseLong(req.getParameter("id")));
        t.setPW(req.getParameter("pw"));
        return teacherMapper.addteacher(t);
    }



    @Override
    public List<Homework> selectAll3(){
        return homeworkMapper.selectAll3();
    }

    @Override
    public List<StudentHomework> selectAll1() {

        return studentHomeworkMapper.selectAll1();
    }

}