//设置下拉列表框--teachingPaper
$(function () {
    $('#teachingPaper_searchInput').combobox({
        onChange: function(){
            $("#dg").datagrid({
                url:'/office/teachingPaper/list/'+$("#teachingPaper_searchInput").combobox("getValue")
            });
            // $("#dg").datagrid("load");
        }
    });
});
//设置下拉列表框--testPaper
$(function () {
    $('#testPaper_searchInput').combobox({
        onChange: function(){
            $("#dg").datagrid({
                url:'/office/testPaper/list/'+$("#testPaper_searchInput").combobox("getValue")
            });
            // $("#dg").datagrid("load");
        }
    });
});
//设置下拉列表框--topicPaper
$(function () {
    $('#topicPaper_searchInput').combobox({
        onChange: function(){
            $("#dg").datagrid({
                url:'/office/topicPaper/list/'+$("#topicPaper_searchInput").combobox("getValue")
            });
            // $("#dg").datagrid("load");
        }
    });
});
//设置下拉列表框--trainingPaper
$(function () {
    $('#trainingPaper_searchInput').combobox({
        onChange: function(){
            $("#dg").datagrid({
                url:'/office/trainingPaper/list/'+$("#trainingPaper_searchInput").combobox("getValue")
            });
            // $("#dg").datagrid("load");
        }
    });
});
function perInf1() {

    alert("perInf1");
    $.post("/user/personalInfo",{uid:"133", employeenum:$("#empNum").val(), phone:$("#phoneNum").val(), email:$("#email").val()},function (data) {
        alert(data);
    });
}
function subNewUser() {
    $.post("/user/addition",{
        employeenum:$("#employeenum").val(),
        username:$("#username").val(),
        roleidsstr:$("#roleSelect").val(),
        deptid:$("#depSelect").val(),
        email:$("#email").val(),
        phone:$("#phone").val(),
    },function (backresult) {
        alert(backresult);
    })
}
function newQpaper() {
    $("#fm").form("clear");
    $("#qpaperDialog").dialog("open").dialog("setTitle","试卷归档--新建");
    url = "/office/testPaper/addition";
}
function editQpaper() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#qpaperDialog").dialog("open").dialog("setTitle","试卷归档--编辑");
        $("#fm").form("load",row);
        url = "/office/testPaper/updates/"+row.qid;
    }
}
function destroyQpaper() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/office/testPaper/deletion/"+row.qid,
                    success: function (res) {
                        alert(res);
                        $("#qpaperDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveQpaper() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#qpaperDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function newTpaper() {
    $("#fm").form("clear");
    $("#tpaperDialog").dialog("open").dialog("setTitle","实训归档--新建");
    url = "/office/trainingPaper/addition";
}
function editTpaper() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#tpaperDialog").dialog("open").dialog("setTitle","实训归档--编辑");
        $("#fm").form("load",row);
        url = "/office/trainingPaper/updates/"+row.tid;
    }
}
function destroyTpaper() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/office/trainingPaper/deletion/"+row.tid,
                    success: function (res) {
                        alert(res);
                        $("#tpaperDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveTpaper() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#tpaperDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function newTopaper() {
    $("#fm").form("clear");
    $("#topaperDialog").dialog("open").dialog("setTitle","教研课题--新建");
    url = "/office/topicPaper/addition";
}
function editTopaper() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#topaperDialog").dialog("open").dialog("setTitle","教研课题--编辑");
        $("#fm").form("load",row);
        url = "/office/topicPaper/updates/"+row.uuid;
    }
}
function destroyTopaper() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/office/topicPaper/deletion/"+row.uuid,
                    success: function (res) {
                        alert(res);
                        $("#topaperDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveTopaper() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#topaperDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
function newTepaper() {
    $("#fm").form("clear");
    $("#tepaperDialog").dialog("open").dialog("setTitle","教研论文--新建");
    url = "/office/teachingPaper/addition";
}
function editTepaper() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#tepaperDialog").dialog("open").dialog("setTitle","教研论文--编辑");
        $("#fm").form("clear");
        $("#fm").form("load",row);
        url = "/office/teachingPaper/updates/"+row.uuid;
    }
}
function destroyTepaper() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/office/teachingPaper/deletion/"+row.uuid,
                    success: function (res) {
                        alert(res);
                        $("#tepaperDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveTepaper() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#tepaperDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
function showTePaper(u) {
    $("#imgDialog").dialog({
        title:"查看",
        width: 550,
        height: 550,
        closed: false,
        cache: false,
        modal: true
    });
    $("#imgTePaper").attr("src","/office/teachingPaper/showTePaper/"+u);
}
//设置下拉列表框--字典管理
$(function () {
    $('#searchInput').combobox({
        onChange: function(){
            $("#dg").datagrid({
                url:'/system/dictionary/list/'+$("#searchInput").combobox("getValue")
            });
            // $("#dg").datagrid("load");
        }
    });
});
//设置下拉列表框--字典管理end
function newSystemDDL(){
    $("#fm").form("clear");
    $("#sysDDLDialog").dialog("open").dialog("setTitle","字典管理--新建");
    url = "/system/dictionary/addition";
}
function editSystemDDL(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#sysDDLDialog").dialog("open").dialog("setTitle","字典管理--编辑");
        $("#fm").form("clear");
        $("#fm").form("load",row);
        url = "/system/dictionary/updates/"+row.uuid;
    }
}
function destroySystemDDL(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/system/dictionary/deletion/"+row.uuid,
                    success: function (res) {
                        alert(res);
                        $("#sysDDLDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveSysDDL(){
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#sysDDLDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}

function newNotice() {
    $("#fm").form("clear");
    $("#noticeDialog").dialog("open").dialog("setTitle", "通知管理--新建");
    url = "/system/notice/addition";
}
function destroyNotice(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/system/notice/deletion/"+row.uuid,
                    success: function (res) {
                        alert(res);
                        $("#noticeDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveNotice(){
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#noticeDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
function showNotice(u) {
    $.get("/system/notice/"+u,null,function (res) {
        $("#noticeDialog").dialog({
            title: "查看",
            width: 550,
            height: 550,
            closed: false,
            cache: false,
            modal: true,
            content:res
        });
    });
}
function login() {
    $("#fm").form("submit",{
        url:"/login",
        success:function (res) {
            window.location.href = res;
        }
    })
}
function logout() {
    $.get("/logout",null,function (res) {
        window.location.href = "/login_UI";
    })
}
function newUser() {
    $("#fm").form("clear");
    $("#userDialog").dialog("open").dialog("setTitle","新建");
    url = "/user/addition";
}
function editUser() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#userDialog").dialog("open").dialog("setTitle","编辑");
        $("#fm").form("load",row);
        url = "/user/updates/"+row.uid;
    }
}
function destroyUser() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/user/deletion/"+row.uid,
                    success: function (res) {
                        alert(res);
                        $("#userDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveUser() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#userDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function newProcess() {
    $("#fm").form("clear");
    $("#processDialog").dialog("open").dialog("setTitle","流程管理--新建");
    url = "/system/process/addition";
}
function destroyProcess() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/system/process/deletion/"+row.deploymentId,
                    success: function (res) {
                        alert(res);
                        $("#processDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveProcess() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#processDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
function showProPng(deploymentId,diagramResourceName) {
    $("#imgDialog").dialog({
        title:"查看",
        width: 550,
        height: 550,
        closed: false,
        cache: false,
        modal: true
    });
    $("#imgPro").attr("src","/system/process/ProPng/"+deploymentId+"/"+diagramResourceName);
}
function newAward() {
    $("#fm").form("clear");
    $("#awardDialog").dialog("open").dialog("setTitle","获奖情况--申请");
    url = "/office/award/addition";
}
function saveAward() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#awardDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
function deleteAward() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/office/award/deletion/"+row.aid,
                    success: function (res) {
                        alert(res);
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
//
// function applyAwardBegin(aid) {
//     $.post("/office/award/beginning",{
//         aid: aid
//     },function (res) {
//         alert(res);
//     })
// }
function doTask() {
    var row = $("#dg").datagrid("getSelected");
    if (row && row.voAction == null){
        $.get("/office/myTask/taskInfo/"+row.id,null,function (res) {
            $("#taskDialog").dialog("open").dialog("setTitle","任务办理");
            if ($("#state").length != 0){
                $("#fm1").form("load",res);
                $('#state').combobox({
                    url:'/office/myTask/sequenceFlow/'+row.id,
                    valueField:'voAuditOpinion',
                    textField:'voAuditOpinion'
                });
                url = "/office/myTask/act_completion/"+row.id;
            }else {
                $("#fm").form("load",res);
                $("#fm1").form("load",res);
                url = "/office/myTask/user_completion/"+row.id;
            }
        })
    }
}
function completeTask() {
    $("#fm").form("submit",{
        url:url,
        success:function (res) {
            alert(res);
            $("#taskDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
function claimTask(taskId) {
    $.post("/office/myTask/claiming",{
        taskId:taskId
    },function () {
        $("#dg").datagrid("reload");
    })
}
function showAwardPic(aid) {
    $("#imgDialog").dialog({
        title:"查看",
        width: 550,
        height: 550,
        closed: false,
        cache: false,
        modal: true
    });
    $("#imgAward").attr("src","/office/award/pic/"+aid);
}
function newRole() {
    $("#fm").form("clear");
    $("#roleDialog").dialog("open").dialog("setTitle","角色管理--新建");
    url = "/system/role/addition";
}
function editRole() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#roleDialog").dialog("open").dialog("setTitle","角色管理--编辑");
        $("#fm").form("clear");
        $("#fm").form("load",row);
        url = "/system/role/updates/"+row.rid;
    }
}
function destroyRole() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/system/role/deletion/"+row.ddlid,
                    success: function (res) {
                        alert(res);
                        $("#roleDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveRole() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#roleDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}

//CREDIT
function newStudent() {
    $("#fm").form("clear");
    $("#studentDialog").dialog("open").dialog("setTitle","新建");
    url = "/student/addition";
}
function editStudent() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#studentDialog").dialog("open").dialog("setTitle","编辑");
        $("#fm").form("load",row);
        url = "/student/updates?sid="+row.sid;
    }
}
function destroyStudent() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/student/deletion?sid="+row.sid,
                    success: function (res) {
                        alert(res);
                        $("#studentDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveStudent() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#studentDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function subNewStudent() {
    $.post("/student/addition",{
        number:$("#number").val(),
        username:$("#username").val(),
        sex:$("input[name='sex']:checked").val(),
        classs:$("#classs").val(),
        department:$("#department").val(),
        email:$("#email").val(),
        phone:$("#phone").val(),
    },function (backresult) {
        alert(backresult);
    })
}
function newBasic() {
    $("#fm").form("clear");
    $("#basicDialog").dialog("open").dialog("setTitle","新建");
    url = "/basic/addition";
}
function editBasic() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#basicDialog").dialog("open").dialog("setTitle","编辑");
        $("#fm").form("load",row);
        url = "/basic/updates?bsid="+row.bsid;
    }
}
function destroyBasic() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/basic/deletion?bsid="+row.bsid,
                    success: function (res) {
                        alert(res);
                        $("#basicDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveBasic() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#basicDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function newLearning() {
    $("#fm").form("clear");
    $("#learningDialog").dialog("open").dialog("setTitle","新建");
    url = "/learning/addition";
}
function editLearning() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#learningDialog").dialog("open").dialog("setTitle","编辑");
        $("#fm").form("load",row);
        url = "/learning/updates?laid="+row.laid;
    }
}
function destroyLearning() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/learning/deletion?laid="+row.laid,
                    success: function (res) {
                        alert(res);
                        $("#learningDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveLearning() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#learningDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function newReward() {
    $("#fm").form("clear");
    $("#rewardDialog").dialog("open").dialog("setTitle","新建");
    url = "/reward/addition";
}
function editReward() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#rewardDialog").dialog("open").dialog("setTitle","编辑");
        $("#fm").form("load",row);
        url = "/reward/updates?rpid="+row.rpid;
    }
}
function destroyReward() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/reward/deletion?rpid="+row.rpid,
                    success: function (res) {
                        alert(res);
                        $("#rewardDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveReward() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#rewardDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function newTrust() {
    $("#fm").form("clear");
    $("#trustDialog").dialog("open").dialog("setTitle","新建");
    url = "/trust/addition";
}
function editTrust() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#trustDialog").dialog("open").dialog("setTitle","编辑");
        $("#fm").form("load",row);
        url = "/trust/updates?twid="+row.twid;
    }
}
function destroyTrust() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/trust/deletion?twid="+row.twid,
                    success: function (res) {
                        alert(res);
                        $("#trustDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveTrust() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#trustDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function newReputation() {
    $("#fm").form("clear");
    $("#reputationDialog").dialog("open").dialog("setTitle","新建");
    url = "/reputation/addition";
}
function editReputation() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#reputationDialog").dialog("open").dialog("setTitle","编辑");
        $("#fm").form("load",row);
        url = "/reputation/updates?reid="+row.reid;
    }
}
function destroyReputation() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/reputation/deletion?reid="+row.reid,
                    success: function (res) {
                        alert(res);
                        $("#reputationDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveReputation() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#reputationDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}

