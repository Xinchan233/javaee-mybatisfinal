package com.example.mybatis.controller;

import com.example.mybatis.model.Homework;
import com.example.mybatis.model.Student;
import com.example.mybatis.model.StudentHomework;
import com.example.mybatis.service.AllSServiceImpl;
import com.example.mybatis.service.AllTServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class ApiController {
    private final AllSServiceImpl allSService;
    private final AllTServiceImpl allTService;


    @Autowired
    public ApiController(AllSServiceImpl allSService,AllTServiceImpl allTService) {

        this.allSService = allSService;
        this.allTService = allTService;
    }

    @RequestMapping("/login")
    public void login (HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("slogin");
        // List<Student> list= allSService.login(req);
        boolean a=allSService.login(req);
        if(a==true){
            req.getRequestDispatcher("/student_choose.jsp").forward(req,resp);
        }
    }

    @RequestMapping("/sregister")
    public void sregister (HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("utf-8");
        boolean i = allSService.addstudent(req);

        if(i=true){
            //完成数据库操作，返回响应给jsp
            req.getRequestDispatcher("/student_choose.jsp").forward(req,resp);
        }else{
            System.out.println("false");
        }
    }

    @RequestMapping("/tregister")
    public void tregister (HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("utf-8");
        boolean i = allTService.addteacher(req);

        if(i=true){
            //完成数据库操作，返回响应给jsp
            req.getRequestDispatcher("/teacher_choose.jsp").forward(req,resp);
        }else{
            System.out.println("false");
        }
    }

    @RequestMapping("/Tlogin")
    public void Tlogin (HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("tlogin");
        // List<Student> list= allSService.login(req);
        boolean b=allTService.login(req);
        if(b==true){
            req.getRequestDispatcher("/teacher_choose.jsp").forward(req,resp);
        }else{
            //update1(req,resp);
        }
        req.getRequestDispatcher("/teacher_login.jsp").forward(req,resp);
    }

    @RequestMapping("/submit_trans")
    public void submit_trans(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("/student_submithw.jsp").forward(req,resp);
    }
    @RequestMapping("/check_teacherhw")
    public void check_teacherhw(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        List<Homework> list2 = allTService.selectAll3();
        if(null == list2 || list2.size() <= 0){
            req.setAttribute("flag",false);
        }else{
            req.setAttribute("flag",true);
            req.setAttribute("list2",list2);
        }
        req.getRequestDispatcher("/hwlist.jsp").forward(req,resp);
    }

    @RequestMapping("/check_allhw")
    public void check_allhw(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        List<Homework> list2 = allTService.selectAll3();
        if(null == list2 || list2.size() <= 0){
            req.setAttribute("flag",false);
        }else{
            req.setAttribute("flag",true);
            req.setAttribute("list2",list2);
        }
        req.getRequestDispatcher("/hwlist.jsp").forward(req,resp);
    }
    //作业提交执行
    @RequestMapping("/SubmitHomeworkServlet")
    public void submitHomework(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("utf-8");
        boolean i = allSService.addHomework(req);

        if(i=true){
            //完成数据库操作，返回响应给jsp
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        List<StudentHomework> list2 = allTService.selectAll1();
        if(null == list2 || list2.size() <= 0){
            req.setAttribute("flag",false);
        }else{
            req.setAttribute("flag",true);
            req.setAttribute("list2",list2);
        }
        req.getRequestDispatcher("/student_hwlist.jsp").forward(req,resp);
    }

    @RequestMapping("/updateHomeworkServlet")
    public void updateHomework(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("utf-8");
        boolean i = allSService.updateHomework(req);

        if(i=true){
            //完成数据库操作，返回响应给jsp
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        List<StudentHomework> list2 = allTService.selectAll1();
        if(null == list2 || list2.size() <= 0){
            req.setAttribute("flag",false);
        }else{
            req.setAttribute("flag",true);
            req.setAttribute("list2",list2);
        }
        req.getRequestDispatcher("/student_hwlist.jsp").forward(req,resp);
    }

    @RequestMapping("/TaddHomework")
    public void TADDHomework (HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("utf-8");
        boolean i = allTService.addHomework(req);

        if(i=true){
            //完成数据库操作，返回响应给jsp
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        List<Homework> list2 = allTService.selectAll3();
        if(null == list2 || list2.size() <= 0){
            req.setAttribute("flag",false);
        }else{
            req.setAttribute("flag",true);
            req.setAttribute("list2",list2);
        }
        req.getRequestDispatcher("/hwlist.jsp").forward(req,resp);
    }

    @RequestMapping("/addhw_trans")
    public void addhw_trans(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("/teacher_addhw.jsp").forward(req,resp);
    }

    @RequestMapping("/update_trans")
    public void update_trans(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("/student_updatehw.jsp").forward(req,resp);
    }

    @RequestMapping("/check_studenthw")
    public void check_studenthw(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        List<StudentHomework> list2 = allTService.selectAll1();
        if(null == list2 || list2.size() <= 0){
            req.setAttribute("flag",false);
        }else{
            req.setAttribute("flag",true);
            req.setAttribute("list2",list2);
        }
        req.getRequestDispatcher("/student_hwlist.jsp").forward(req,resp);
    }

}
