<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>personalInfo</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/material/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="application/javascript" src="/ui/credit.js"></script>
</head>
<body>
<div style="width: 900px;height: auto;margin: 0 auto">
    <div class="messager-body" style="width: auto;height: auto;margin: 0 auto">
        <c:if test="${role == 1}">
            <div class="messager-input" style="height: 56px; margin: 10px;">
                <p align="center" style="font-size: 16px;">
                    <label for="employeenum" >工&nbsp;&nbsp;号 </label>
                    <input id="employeenum"  class="easyui-textbox" style="width: 300px;height: 32px"/>
                </p>
            </div>
        </c:if>
        <c:if test="${role == 2}">
            <div class="messager-input" style="height: 56px; margin: 10px;">
                <p align="center" style="font-size: 16px;">
                    <label for="number" >学&nbsp;&nbsp;号 </label>
                    <input id="number"  class="easyui-textbox" style="width: 300px;height: 32px"/>
                </p>
            </div>
        </c:if>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 16px;">
                <label for="username" >用户名: </label>
                <input id="username" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 16px;">
                <label for="classs" >班级: </label>
                <input id="classs" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 16px;">
                <label for="email" >邮&nbsp;&nbsp;箱: </label>
                <input id="email" class="easyui-textbox"   style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 16px;">
                <label for="phone" >手机号: </label>
                <input id="phone" class="easyui-textbox"  style="width: 300px;height: 32px"/>
            </p>
        </div>
        <c:if test="${role} == '1'">
            <div class="messager-button" style="height: 56px; margin: 10px;">
                <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="perInf1_teacher()">
                    <span style="font-size: 16px">提交</span>
                </a>
            </div>
        </c:if>
        <c:if test="${role} == '2'">
            <div class="messager-button" style="height: 56px; margin: 10px;">
                <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="perInf1_student()">
                    <span style="font-size: 16px">提交</span>
                </a>
            </div>
        </c:if>
        <div>
            <input id="id" type="hidden" value="${id}"/>
        </div>
    </div>
</div>



</body>
</html>

