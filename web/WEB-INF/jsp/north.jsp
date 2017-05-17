<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<div style="text-align: center;font-family: 微软雅黑;font-size: 25px;" >学生信用管理系统
        <c:if test="${user != null}">
        <span style="display:block; width: 300px; float:right; text-align:right;font-family: 微软雅黑;font-size: 16px;">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您，${user}&nbsp;&nbsp;
            <a href="#" onclick="logout()">退出</a>
        </span>
        </c:if>
</div>
</body>
</html>
