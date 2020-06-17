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
</head>
<body>

<div align="center">
    <h2>老师，请选择：</h2>
    <form action="${pageContext.request.contextPath}/app/addhw_trans" method="post">
        <table style="line-height: 40px">

            <tr align="center">
                <td><button type="submit" class="btn">发布作业</button></td>
            </tr>
        </table>
    </form>
    <form action="${pageContext.request.contextPath}/app/check_studenthw" method="post">
        <table style="line-height: 40px">

            <tr align="center">
                <td><button type="submit" class="btn">查看学生作业</button></td>
            </tr>
        </table>
    </form>
    <form action="${pageContext.request.contextPath}/app/check_allhw" method="post">
        <table style="line-height: 40px">

            <tr align="center">
                <td><button type="submit" class="btn">查看老师发布的作业</button></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>

</body>
</html>
