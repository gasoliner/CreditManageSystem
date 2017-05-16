<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>basic</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/ui-pepper-grinder/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/credit.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/credit.js"></script>
    <script type="text/javascript">
        function scoreChange() {
//            alert($("#classmatescore").val());
            $("#bsscore").val(
                    Math.round((Number($("#classmatescore").val())+Number($("#teacherscore").val()))/2)
            );
        };
    </script>
</head>
<body>
<div align="center">
    <table id="dg" title="基本情况相关表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/basic/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="school" width="50">学校</th>
            <th field="startschool" width="50">入学时间</th>
            <th field="classmatescore" width="50">同学评价</th>
            <th field="teacherscore" width="50">老师评价</th>
            <th field="bsscore" width="50">基本素质情况评分</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newBasic()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editBasic()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyBasic()">删除</a>
</div>
<div id="basicDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#basicForm-buttons">
    <div class="ftitle">基本素质评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>学校&nbsp;&nbsp;&nbsp;</label>
            <input name="school" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>入学时间&nbsp;&nbsp;&nbsp;</label>
            <input name="startschool">
        </div><br/>
        <div class="fitem">
            <label>同学评分&nbsp;&nbsp;&nbsp;</label>
            <input id="classmatescore" name="classmatescore" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>老师评分&nbsp;&nbsp;&nbsp;</label>
            <input id="teacherscore" name="teacherscore" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>基本素质评分&nbsp;&nbsp;&nbsp;</label>
            <input id="bsscore" name="bsscore">
        </div>
    </form>
</div>
<div id="basicForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveBasic()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#basicDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>