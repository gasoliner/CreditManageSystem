<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>learning</title>
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
    <table id="dg" title="学习能力相关表" class="easyui-datagrid" style="width: 100%;height:auto"
            <c:if test="${role== 1}">
                toolbar="#toolbar"
            </c:if>           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
<c:if test="${role== 1}">
            url:'/learning/list',
</c:if>
<c:if test="${role== 2}">
            url:'/learning/list?user=${user}',
</c:if>
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="jidian" width="50">绩点</th>
            <th field="losemajor" width="50">挂科数</th>
            <th field="scholarship" width="50">奖学金</th>
            <th field="ranking" width="50">专业排名</th>
            <th field="lascore" width="50">学习能力评分</th>
        </tr>
        </thead>
    </table>
</div>
<c:if test="${role== 1}">
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newLearning()">新建</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editLearning()">编辑</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyLearning()">删除</a>
    </div>
</c:if>
<div id="learningDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#learningForm-buttons">
    <div class="ftitle">学习能力评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>绩点&nbsp;&nbsp;&nbsp;</label>
            <input name="jidian" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>挂科数&nbsp;&nbsp;&nbsp;</label>
            <input name="losemajor">
        </div><br/>
        <div class="fitem">
            <label>奖学金&nbsp;&nbsp;&nbsp;</label>
            <%--<input id="scholarship" name="scholarship" onchange="scoreChange()">--%>
            <input name="scholarship">
        </div><br/>
        <div class="fitem">
            <label>专业排名&nbsp;&nbsp;&nbsp;</label>
            <%--<input name="ranking" onchange="scoreChange()">--%>
            <input name="ranking">
        </div><br/>
        <div class="fitem">
            <label>学习能力评分&nbsp;&nbsp;&nbsp;</label>
            <input id="lascore" name="lascore">
        </div>
    </form>
</div>
<div id="learningForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveLearning()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#basicDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
