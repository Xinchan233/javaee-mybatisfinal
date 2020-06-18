<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        body{
            font-size:40px;
            background:url(/Img/2.jpg);
            background-repeat: no-repeat;
            background-size: 100% auto;
        }
    </style>
<%--    <meta charset="UTF-8">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
<%--    <title>Document</title>--%>
<%--    <link  rel="stylesheet"  href="./Css/Index.css">--%>
<%--    <link  rel="stylesheet"  href="font-awesome-4.7.0/css/font-awesome.css">--%>
</head>
<body>
<div align="center" class="login">
    <div style="color: white"><h5>student update homework</h5></div>

    <form action="${pageContext.request.contextPath}/app/updateHomeworkServlet" method="post">
        <div class="form">
            <div class="item">
                <i class="fa fa-user-circle" aria-hidden="true"></i>
                <input name="id" type=text placeholder="StudentID" >
            </div>
            <div class="item">
                <i class="fa fa-user-circle" aria-hidden="true"></i>
                <input name="hwid" type=text placeholder="homeworkID" >
            </div>
            <div class="item">
                <i class="fa fa-user-circle" aria-hidden="true"></i>
                <input name="hwname" type=text placeholder="homeworkName_changed" >
            </div>
            <div class="item">
                <i class="fa fa-key" aria-hidden="true"></i>
                <input name="content" type=text placeholder="content_changed" >
            </div>

        </div>
        <button type="submit" value="Login">submit</button>
    </form>
</div>
</body>
</html>
