<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2020/6/17
  Time: 00:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>choose</title>
    <style>
        body{
            font-size:40px;
            background:url(/Img/2.jpg);
            background-repeat: no-repeat;
            background-size: 100% auto;
        }
    </style>
</head>
<body>

<div align="center">
    <div style="color: white"><h2>同学，请选择：</h2></div>
    <form action="${pageContext.request.contextPath}/app/submit_trans" method="post">
        <table style="line-height: 40px">

            <tr align="center">
                <td><button style="font-size:20pt" type="submit" class="btn">提交作业</button></td>
            </tr>
        </table>
    </form>
    <form action="${pageContext.request.contextPath}/app/update_trans" method="post">
        <table style="line-height: 60px">

            <tr align="center">
                <td><button style="font-size:20pt" type="submit" class="btn">修改作业</button></td>
            </tr>
        </table>
    </form>
    <form action="${pageContext.request.contextPath}/app/check_teacherhw" method="post">
        <table style="line-height: 40px">

            <tr align="center">
                <td><button style="font-size:20pt" type="submit" class="btn">查看老师发布的作业</button></td>
            </tr>
        </table>
    </form>
    <form action="${pageContext.request.contextPath}/app/check_allhw" method="post">
        <table style="line-height: 40px">

            <tr align="center">
                <td><button style="font-size:20pt" type="submit" class="btn">查看所有学生作业</button></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>

