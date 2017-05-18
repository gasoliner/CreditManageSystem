package cn.creditmanage.servlet;


import cn.creditmanage.po.User;
import cn.creditmanage.service.LogService;
import cn.creditmanage.service.impl.LogServiceImpl;
import cn.creditmanage.util.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    LogService logService = new LogServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestName = PageUtil.getRequestName(req.getRequestURL().toString());
        if (requestName.equals("login")){
            resp.getWriter().print(login(req,resp));
        }else if (requestName.equals("logout")){
            resp.getWriter().print(logout(req));
        }
    }

    private String logout(HttpServletRequest req) {
        req.getSession().invalidate();
        return null;
    }

    private String login(HttpServletRequest req,HttpServletResponse response) throws IOException {
        String username = "";
        String password = "";
        String role = "";
        if (req.getParameter("username")!=null){
            username = req.getParameter("username");
        }
        if (req.getParameter("password")!=null){
            password = req.getParameter("password");
        }
        if (req.getParameter("role")!=null){
            role = req.getParameter("role");
        }
        User user = new User();
        if (role.equals("student")){
            user.setUsername(username);
            user.setPassword(password);
            user.setRole(2);
            if (logService.studentLogin(user)){
                int id = logService.getStudentByUserName(user.getUsername()).getSid();
                req.getSession().setAttribute("id",id);
                req.getSession().setAttribute("user",user.getUsername());
                req.getSession().setAttribute("role",user.getRole());
                return "/UI/index";
            }else {
                return "/UI/sign";
            }

        }else {

            user.setUsername(username);
            user.setPassword(password);
            user.setRole(1);
            if (logService.teacherLogin(user)){
                int id = logService.getTeacherByUserName(user.getUsername()).getTid();
                req.getSession().setAttribute("id",id);
                req.getSession().setAttribute("user",user.getUsername());
                req.getSession().setAttribute("role",user.getRole());
                return "/UI/index";
            }else {
                return "/UI/sign";
            }
        }
    }

}
