package cn.creditmanage.servlet;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.Student;
import cn.creditmanage.service.StudentService;
import cn.creditmanage.service.impl.StudentServiceImpl;
import cn.creditmanage.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class StudentServlet extends HttpServlet {

    private StudentService studentService = new StudentServiceImpl();

    public StudentServlet() throws IOException {
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestName = PageUtil.getRequestName(req.getRequestURL().toString());
        if (requestName.equals("addition")){
            resp.getWriter().print(addtion(req));
        }else if (requestName.equals("list")){
            resp.getWriter().print(list(req));
        }else if (requestName.equals("deletion")){
            resp.getWriter().print(delete(req));
        }else {
            resp.getWriter().print(update(req));
        }
    }

    private String delete(HttpServletRequest req) {
        studentService.delete(Integer.parseInt(req.getParameter("sid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        studentService.update(getStudentByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPage(Integer.parseInt(request.getParameter("page")));
        pageInfo.setSize(Integer.parseInt(request.getParameter("rows")));
        return JSON.toJSONString(studentService.getStudentList(pageInfo));
    }

    public String addtion(HttpServletRequest request){
        studentService.insert(getStudentByRequest(request));
        return JSON.toJSONString("successful");
    }

    public Student getStudentByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        Student student = new Student();


        if (parameterMap.get("sid")!=null && parameterMap.get("sid").length > 0){
            student.setSid(Integer.parseInt(parameterMap.get("sid")[0]));
        }
        if (parameterMap.get("number")!=null && parameterMap.get("number").length > 0){
            student.setNumber(Long.parseLong(parameterMap.get("number")[0]));
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            student.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("sex")!=null &&parameterMap.get("sex").length > 0){
            student.setSex(parameterMap.get("sex")[0]);
        }
        if (parameterMap.get("classs")!=null &&parameterMap.get("classs").length > 0){
            student.setClasss(parameterMap.get("classs")[0]);
        }
        if (parameterMap.get("department")!=null &&parameterMap.get("department").length > 0){
            student.setDepartment(parameterMap.get("department")[0]);
        }
        if (parameterMap.get("email")!=null &&parameterMap.get("email").length > 0){
            student.setEmail(parameterMap.get("email")[0]);
        }
        if (parameterMap.get("phone")!=null &&parameterMap.get("phone").length > 0){
            student.setPhone(parameterMap.get("phone")[0]);
        }
        return student;
    }
}
