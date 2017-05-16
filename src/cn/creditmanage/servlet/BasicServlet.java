package cn.creditmanage.servlet;

import cn.creditmanage.po.BasicSituation;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.service.BasicService;
import cn.creditmanage.service.impl.BasicServiceImpl;
import cn.creditmanage.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class BasicServlet extends HttpServlet {

    private BasicService basicService = new BasicServiceImpl();

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
        basicService.delete(Integer.parseInt(req.getParameter("bsid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        basicService.update(getBasicSituationByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPage(Integer.parseInt(request.getParameter("page")));
        pageInfo.setSize(Integer.parseInt(request.getParameter("rows")));
        return JSON.toJSONString(basicService.list(pageInfo));
    }

    public String addtion(HttpServletRequest request){
        basicService.insert(getBasicSituationByRequest(request));
        return JSON.toJSONString("successful");
    }

    public BasicSituation getBasicSituationByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        BasicSituation basicSituation = new BasicSituation();


        if (parameterMap.get("bsid")!=null && parameterMap.get("bsid").length > 0){
            basicSituation.setBsid((Integer.parseInt(parameterMap.get("bsid")[0])));
        }
        if (parameterMap.get("bsscore")!=null && parameterMap.get("bsscore").length > 0){
            basicSituation.setBsscore(Integer.parseInt(parameterMap.get("bsscore")[0]));
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            basicSituation.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("school")!=null &&parameterMap.get("school").length > 0){
            basicSituation.setSchool(parameterMap.get("school")[0]);
        }
        if (parameterMap.get("startschool")!=null &&parameterMap.get("startschool").length > 0){
            basicSituation.setStartschool(parameterMap.get("startschool")[0]);
        }
        if (parameterMap.get("classmatescore")!=null &&parameterMap.get("classmatescore").length > 0){
            basicSituation.setClassmatescore(Integer.parseInt(parameterMap.get("classmatescore")[0]));
        }
        if (parameterMap.get("teacherscore")!=null &&parameterMap.get("teacherscore").length > 0){
            basicSituation.setTeacherscore(Integer.parseInt(parameterMap.get("teacherscore")[0]));
        }
        return basicSituation;
    }
}
