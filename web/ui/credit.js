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
function login() {
    $("#fm").form("submit",{
        url:"/log/login",
        success:function (res) {
            // alert(res);
            window.location.href = res;
        }
    })
}
function logout() {
    $.get("/log/logout",null,function (res) {
        window.location.href = "/UI/sign";
    })
}
function perInf1_teacher() {
    $.post("/info/update_t",
        {
            tid:$("#id").val(),
            employeenum:$("#employeenum").val(),
            username:$("#username").val(),
            classs:$("#classs").val(),
            phone:$("#phone").val(),
            email:$("#email").val()
        },
        function (data) {
            alert(data);
        });
}
function perInf1_student() {
    $.post("/info/update_s",
        {
            sid:$("#id").val(),
            number:$("#number").val(),
            username:$("#username").val(),
            classs:$("#classs").val(),
            phone:$("#phone").val(),
            email:$("#email").val()
        },
        function (data) {
            alert(data);
        });
}
function perPas1() {

    $.post("/info/password",
        {
            tid:$("#tid").val(),
            rid:$("#rid").val(),
            oldpassword:$("#oldpass").val(),
            newpassword1:$("#newpass").val(),
            newpassword2:$("#newpass1").val()
        },
        function (data) {
            alert(data);
        });
}

