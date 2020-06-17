package com.example.mybatis.service;

import com.example.mybatis.dao.HomeworkDao;
import com.example.mybatis.dao.StudentDao;
import com.example.mybatis.dao.StudentHomeworkDao;
import com.example.mybatis.model.Student;
import com.example.mybatis.model.StudentHomework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class AllSServiceImpl implements AllSService {

    @Resource
    private final HomeworkDao homeworkDao;
    private final StudentDao studentDao;
    private final StudentHomeworkDao studentHomeworkDao;

    @Autowired
    public AllSServiceImpl(HomeworkDao homeworkDao,StudentDao studentDao, StudentHomeworkDao studentHomeworkDao) {
        this.homeworkDao=homeworkDao;
        this.studentDao = studentDao;
        this.studentHomeworkDao = studentHomeworkDao;
    }


    @Override
    public boolean login(HttpServletRequest req) {
        Student sId = new Student();
        sId.setStudentId(Long.parseLong(req.getParameter("sId")));
        sId.setPW(req.getParameter("pw"));

        List<Student> list=studentDao.find2(sId.getStudentId(),sId.getPW());

        if(null == list || list.size() <= 0){
            return false;
        }else{
            return true;
        }

    }

    @Override
    public boolean addHomework(HttpServletRequest req) {
        StudentHomework sh = new StudentHomework();

        System.out.println("SubmitHomeworkServlet"+Long.parseLong(req.getParameter("id")));

        sh.setStudentId(Long.parseLong(req.getParameter("id")));
        sh.setHomeworkId(Long.parseLong(req.getParameter("hwid")));
        sh.setHomeworkTitle(req.getParameter("hwname"));
        sh.setHomeworkContent(req.getParameter("content"));
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        sh.setCreateTime(date);

        return studentHomeworkDao.addHomework(sh);

    }

    @Override
    public boolean updateHomework(HttpServletRequest req) {
        StudentHomework sh = new StudentHomework();

        sh.setStudentId(Long.parseLong(req.getParameter("id")));
        sh.setHomeworkId(Long.parseLong(req.getParameter("hwid")));
        sh.setHomeworkTitle(req.getParameter("hwname"));
        sh.setHomeworkContent(req.getParameter("content"));
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        sh.setCreateTime(date);

        return studentHomeworkDao.updateHomework(sh);

    }

    @Override
    public boolean addstudent(HttpServletRequest req) {
        Student s = new Student();

        s.setStudentId(Long.parseLong(req.getParameter("sId")));
        s.setName(req.getParameter("name"));
        s.setPW(req.getParameter("pw"));

        return studentDao.addstudent(s);

    }



}
