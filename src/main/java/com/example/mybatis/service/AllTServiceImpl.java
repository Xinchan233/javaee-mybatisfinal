package com.example.mybatis.service;


import com.example.mybatis.dao.HomeworkDao;
import com.example.mybatis.dao.StudentDao;
import com.example.mybatis.dao.StudentHomeworkDao;
import com.example.mybatis.dao.TeacherDao;
import com.example.mybatis.model.Homework;
import com.example.mybatis.model.Student;
import com.example.mybatis.model.StudentHomework;
import com.example.mybatis.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class AllTServiceImpl implements AllTService {
    @Resource
    private final HomeworkDao homeworkDao;
    private final StudentDao studentDao;
    private final StudentHomeworkDao studentHomeworkDao;
    private final TeacherDao teacherDao;

    @Autowired
    public AllTServiceImpl(HomeworkDao homeworkDao, StudentDao studentDao, StudentHomeworkDao studentHomeworkDao, TeacherDao teacherDao) {
        this.homeworkDao = homeworkDao;
        this.studentDao = studentDao;
        this.studentHomeworkDao = studentHomeworkDao;
        this.teacherDao = teacherDao;
    }

    @Override
    public boolean login(HttpServletRequest req) {
        Teacher t=new Teacher();
        t.setId(Long.parseLong(req.getParameter("id")));
        t.setPW(req.getParameter("pw"));
        System.out.println(t.getId()+"     "+t.getPW());
        List<Teacher> list=teacherDao.find4(t.getId(),t.getPW());

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

        return homeworkDao.addHomework(h);
    }

    @Override
    public boolean addteacher(HttpServletRequest req) {
        Teacher t = new Teacher();
        t.setId(Long.parseLong(req.getParameter("id")));
        t.setPW(req.getParameter("pw"));

        return teacherDao.addteacher(t);
    }



    @Override
    public List<Homework> selectAll3(){
        return homeworkDao.selectAll3();
    }

    @Override
    public List<StudentHomework> selectAll1() {
        return studentHomeworkDao.selectAll1();
    }

}