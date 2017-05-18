package cn.creditmanage.servlet;

import cn.creditmanage.po.Student;
import cn.creditmanage.po.Teacher;
import cn.creditmanage.service.InfoService;
import cn.creditmanage.service.impl.InfoServiceImpl;
import cn.creditmanage.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class InfoServlet extends HttpServlet {

    private InfoService infoService = new InfoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestName = PageUtil.getRequestName(req.getRequestURL().toString());
        if (requestName.equals("update_t")){
            resp.getWriter().print(update_t(req));
        }else if (requestName.equals("update_s")){
            resp.getWriter().print(update_s(req));
        }else if (requestName.equals("password")){
            resp.getWriter().print(password(req));
        }
    }

    public String update_t(HttpServletRequest request){
        infoService.update_teacher(getTeByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String update_s(HttpServletRequest request){
        infoService.update_student(getStByRequest(request));
        return JSON.toJSONString("successful");
    }

    private Teacher getTeByRequest(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Teacher t = new Teacher();
        if (parameterMap.get("tid")!=null && parameterMap.get("tid").length > 0){
            t.setTid(Integer.parseInt(parameterMap.get("tid")[0]));
        }
        if (parameterMap.get("employeenum")!=null && parameterMap.get("employeenum").length > 0){
            t.setEmployeenum(Integer.valueOf(parameterMap.get("employeenum")[0]));
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            t.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("classs")!=null &&parameterMap.get("classs").length > 0){
            t.setClasss(parameterMap.get("classs")[0]);
        }
        if (parameterMap.get("email")!=null &&parameterMap.get("email").length > 0){
            t.setEmail(parameterMap.get("email")[0]);
        }
        if (parameterMap.get("phone")!=null &&parameterMap.get("phone").length > 0){
            t.setPhone(parameterMap.get("phone")[0]);
        }
        return t;
    }

    private Student getStByRequest(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Student s = new Student();
        if (parameterMap.get("sid")!=null && parameterMap.get("sid").length > 0){
            s.setSid(Integer.parseInt(parameterMap.get("sid")[0]));
        }
        if (parameterMap.get("number")!=null && parameterMap.get("number").length > 0){
            s.setNumber(Long.valueOf(parameterMap.get("number")[0]));
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            s.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("classs")!=null &&parameterMap.get("classs").length > 0){
            s.setClasss(parameterMap.get("classs")[0]);
        }
        if (parameterMap.get("email")!=null &&parameterMap.get("email").length > 0){
            s.setEmail(parameterMap.get("email")[0]);
        }
        if (parameterMap.get("phone")!=null &&parameterMap.get("phone").length > 0){
            s.setPhone(parameterMap.get("phone")[0]);
        }
        return s;
    }

    public String password(HttpServletRequest request){
        if (infoService.updatePassword(
                request.getParameter("newpassword1"),
                request.getParameter("newpassword2"),
                request.getParameter("oldpassword"),
                Integer.valueOf(request.getParameter("tid")),
                Integer.valueOf(request.getParameter("rid"))
        )){
            return JSON.toJSONString("successful");
        }else {
            return JSON.toJSONString("failed");
        }
    }
}
