<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>studentAdd</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/material/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/credit.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/credit.js"></script>
</head>
<body>

<div style="width: 900px;height: auto;margin: 0 auto">
    <div class="messager-body" style="width: auto;height: auto;margin: 0 auto">
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="number" >学&nbsp;&nbsp;号 </label>
                <input id="number" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="username" >姓&nbsp;&nbsp;名 </label>
                <input id="username" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label>性&nbsp;&nbsp;别&nbsp;&nbsp;&nbsp;</label>
                <input type="radio" name="sex" value="男">男&nbsp;&nbsp;
                <input type="radio" name="sex" value="女">女&nbsp;&nbsp;
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label>班&nbsp;&nbsp;级&nbsp;&nbsp;&nbsp;</label>
                <input id="classs" name="classs" class="easyui-textbox">
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label>系&nbsp;&nbsp;别&nbsp;&nbsp;&nbsp;</label>
                <input id="department" name="department" class="easyui-textbox">
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="email" >邮&nbsp;&nbsp;箱</label>
                <input id="email" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="phone" >手机号</label>
                <input id="phone" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-button" style="height: 56px; margin: 10px;">
            <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="subNewStudent()">
                <span style="font-size: 14px">保存</span>
            </a>
        </div>
    </div>
</div>
</body>
</html>
