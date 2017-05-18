<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>studentList</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/material/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/credit.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/credit.js"></script>
</head>
<body>

<div align="center">
    <table id="dg" title="学生管理" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/student/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="number" width="50">学号</th>
            <th field="username" width="50">姓名</th>
            <th field="sex" width="50">性别</th>
            <th field="classs" width="50">班级</th>
            <th field="department" width="50">系别</th>
            <th field="email" width="50">邮箱</th>
            <th field="phone" width="50">手机号</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newStudent()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editStudent()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyStudent()">删除</a>
</div>
<div id="studentDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#studentForm-buttons">
    <div class="ftitle">学生信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>学号&nbsp;&nbsp;&nbsp;</label>
            <input name="number" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>性别&nbsp;&nbsp;&nbsp;</label>
            <input type="radio" name="sex" value="男">男&nbsp;&nbsp;
            <input type="radio" name="sex" value="女">女&nbsp;&nbsp;
        </div><br/>
        <div class="fitem">
            <label>班级&nbsp;&nbsp;&nbsp;</label>
            <input name="classs" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>系别&nbsp;&nbsp;&nbsp;</label>
            <input name="department" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>邮箱&nbsp;&nbsp;&nbsp;</label>
            <input name="email" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>手机号&nbsp;&nbsp;&nbsp;</label>
            <input name="phone" class="easyui-validatebox">
        </div>
    </form>
</div>
<div id="studentForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveStudent()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#studentDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
