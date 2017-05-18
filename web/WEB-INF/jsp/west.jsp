<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
    .menu-last{
        margin-bottom: 5px;
    }
</style>
<body>
<div class="easyui-accordion" style="width:auto;height: 350px;border: 0px;">
        <div title="个人信息管理" iconCls="icon-mini-edit" selected="true" style="padding:10px;">
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('个人资料修改','UI/personalInfo')">个人资料修改</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('密码修改','UI/updatePass')">密码修改</a>
            </div>
        </div>
    <div title="信用相关管理" iconCls="icon-computer" style="overflow:auto;padding:10px;">

            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('汇总信用相关','UI/allCredit')">汇总信用相关</a>
            </div>

            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('基本情况相关','UI/jiben')">基本情况相关</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('学习能力相关','UI/xuexi')">学习能力相关</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('奖惩记录相关','UI/jiangcheng')">奖惩记录相关</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('信用能力相关','UI/xinyong')">信用能力相关</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('信誉状况相关','UI/xinyu')">信誉状况相关</a>
            </div>
    </div>
    <c:if test="${role == 1}">
    <div title="学生管理" iconCls="icon-man" style="overflow: auto;padding: 10px;">
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('学生列表','UI/studentList')">学生列表</a>
        </div>
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('学生添加','UI/studentAdd')">学生添加</a>
        </div>
    </div>
    </c:if>

</div>
</body>
