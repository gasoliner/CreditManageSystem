<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>reward_punishment</title>
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
    <table id="dg" title="奖惩记录相关表" class="easyui-datagrid" style="width: 100%;height:auto"
    <c:if test="${role== 1}">
        toolbar="#toolbar"
    </c:if>
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
<c:if test="${role== 1}">
            url:'/reward/list',
</c:if>
<c:if test="${role== 2}">
            url:'/reward/list?user=${user}',
</c:if>
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="goodthing" width="50">好人好事</th>
            <th field="schoolreward" width="50">学校奖励</th>
            <th field="breakrule" width="50">违反校规校纪</th>
            <th field="breaklaw" width="50">违法</th>
            <th field="rpscore" width="50">奖惩能力评分</th>
        </tr>
        </thead>
    </table>
</div>
<c:if test="${role== 1}">
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newReward()">新建</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editReward()">编辑</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyReward()">删除</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="showRule()">查看评分细则</a>
    </div>
</c:if>
<div id="rewardDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#rewardForm-buttons">
    <div class="ftitle">奖惩记录评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>好人好事&nbsp;&nbsp;&nbsp;</label>
            <input name="goodthing" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>学校奖励&nbsp;&nbsp;&nbsp;</label>
            <input name="schoolreward">
        </div><br/>
        <div class="fitem">
            <label>违反校规校纪&nbsp;&nbsp;&nbsp;</label>
            <input name="breakrule">
        </div><br/>
        <div class="fitem">
            <label>违法&nbsp;&nbsp;&nbsp;</label>
            <input name="breaklaw">
        </div><br/>
        <div class="fitem">
            <label>奖惩能力评分&nbsp;&nbsp;&nbsp;</label>
            <input id="rpscore" name="rpscore">
        </div>
    </form>
</div>
<div id="rewardForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveReward()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#rewardDialog').dialog('close')">取消</a>
</div>
<div id="ruleDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#rule-buttons">
    <h2 style="box-sizing: border-box; padding-bottom: 0.3em; border-bottom-width: 1px; border-bottom-style: solid; border-bottom-color: rgb(238, 238, 238); margin-top: 1em; margin-bottom: 16px; line-height: 1.225; font-size: 1.75em; color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; white-space: normal;">
        <span style="font-size: 18px;">奖惩记录评分</span>
    </h2>
    <p style="box-sizing: border-box; margin-top: 0px; margin-bottom: 16px; color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; font-size: 14px; line-height: 22.4px; white-space: normal;">
        满分100分，好人好事，学校奖励，违反校规校纪，违法各占25分，其中好人好事、学习奖励初始分值各为0分，采取加分制，违反校规校纪，违法初始分值为25分，采取减分制，各项规则如下。
    </p>
    <ul style="box-sizing: border-box; padding-left: 2em; color: rgb(51, 51, 51); font-family: &#39;Helvetica Neue&#39;, Helvetica, &#39;Segoe UI&#39;, Arial, freesans, sans-serif, &#39;Apple Color Emoji&#39;, &#39;Segoe UI Emoji&#39;, &#39;Segoe UI Symbol&#39;; font-size: 14px; line-height: 22.4px; white-space: normal;" class=" list-paddingleft-2">
        <li>
            <p>
                好人好事
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    A，占5分
                </p>
            </li>
            <li>
                <p>
                    B：占4分
                </p>
            </li>
            <li>
                <p>
                    C：占3分
                </p>
            </li>
            <li>
                <p>
                    D：占2分
                </p>
            </li>
            <li>
                <p>
                    好人好事根据事件程度按ABCD分等级
                </p>
            </li>
            <li>
                <p>
                    通过 A+A+...的方式累加，上限25分
                </p>
            </li>
        </ul>
        <li>
            <p>
                学校奖励
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    A，占5分
                </p>
            </li>
            <li>
                <p>
                    B：占4分
                </p>
            </li>
            <li>
                <p>
                    C：占3分
                </p>
            </li>
            <li>
                <p>
                    D：占2分
                </p>
            </li>
            <li>
                <p>
                    学校奖励包括各种竞赛，活动奖励
                </p>
            </li>
            <li>
                <p>
                    学校奖励根据事件程度按ABCD分等级
                </p>
            </li>
            <li>
                <p>
                    通过 A+A+...的方式累加，上限25分
                </p>
            </li>
        </ul>
        <li>
            <p>
                违反校规校纪
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    A，-5分
                </p>
            </li>
            <li>
                <p>
                    B：-4分
                </p>
            </li>
            <li>
                <p>
                    C：-3分
                </p>
            </li>
            <li>
                <p>
                    D：-2分
                </p>
            </li>
            <li>
                <p>
                    违反校规校纪根据事件程度按ABCD分等级
                </p>
            </li>
            <li>
                <p>
                    通过 A+A+...的方式累计，直至25分扣完
                </p>
            </li>
        </ul>
        <li>
            <p>
                违法
            </p>
        </li>
        <ul style="list-style-type: square;" class=" list-paddingleft-2">
            <li>
                <p>
                    出现一次，奖惩记录评分为0
                </p>
            </li>
        </ul>
    </ul>
    <p>
        <br/>
    </p>
</div>
<div id="rule-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="closeRuleDialog()">好的</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#ruleDialog').dialog('close')">取消</a>
</div>

<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
