<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>trustworthy</title>
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
    <table id="dg" title="信用能力相关表" class="easyui-datagrid" style="width: 100%;height:auto"
            <c:if test="${role== 1}">
                toolbar="#toolbar"
            </c:if>           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
<c:if test="${role== 1}">
            url:'/trust/list',
</c:if>
<c:if test="${role== 2}">
            url:'/trust/list?user=${user}',
</c:if>
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="activities" width="50">参加活动情况</th>
            <th field="iscojob" width="50">是否在校内兼职</th>
            <th field="jingdong" width="50">京东小白评分</th>
            <th field="zhima" width="50">芝麻信用评分</th>
            <th field="twscore" width="50">信用能力评分</th>
        </tr>
        </thead>
    </table>
</div>
<c:if test="${role== 1}">
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newTrust()">新建</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editTrust()">编辑</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyTrust()">删除</a>
    </div>
</c:if>
<div id="trustDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#trustForm-buttons">
    <div class="ftitle">信用能力评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>参加活动情况&nbsp;&nbsp;&nbsp;</label>
            <input name="activities" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>是否在校内兼职&nbsp;&nbsp;&nbsp;</label>
            <input name="iscojob">
        </div><br/>
        <div class="fitem">
            <label>京东小白评分&nbsp;&nbsp;&nbsp;</label>
            <input name="jingdong">
        </div><br/>
        <div class="fitem">
            <label>芝麻信用评分&nbsp;&nbsp;&nbsp;</label>
            <input name="zhima">
        </div><br/>
        <div class="fitem">
            <label>信用能力评分&nbsp;&nbsp;&nbsp;</label>
            <input id="twscore" name="twscore">
        </div>
    </form>
</div>
<div id="trustForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveTrust()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#trustDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
