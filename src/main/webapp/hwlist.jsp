<%@ page import="com.example.mybatis.model.Homework" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2020/6/16
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body{
            font-size:40px;
            background:url(/Img/2.jpg);
            background-repeat: no-repeat;
            background-size: 100% auto;
        }
    </style>
    <title>作业列表</title>
</head>
<body>
<table align="center" width="960" border="1"
       bgcolor="black" cellpadding="1" cellspacing="1">
    <tr align="center" bgcolor="#b0e0e6" height="50">
        <td>ID</td>
        <td>标题</td>
        <td>内容</td>
        <td>创建时间</td>
    </tr>
    <%
        List<Homework> list = (List<Homework>) request.getAttribute("list2");
        if(null == list || list.size() <= 0){
            out.print("None data.");
        }else {
            for (Homework sh : list){
    %>
    <tr align="center" bgcolor="white" height="30">
        <td><%=sh.getId()%></td>
        <td><%=sh.getHomeworkTitle()%></td>
        <td><%=sh.getHomeworkContent()%></td>
        <td><%=sh.getCreateTime()%></td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
