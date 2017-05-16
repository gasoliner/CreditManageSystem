package cn.creditmanage.servlet;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.Reputation;
import cn.creditmanage.service.ReputationService;
import cn.creditmanage.service.impl.ReputationServiceImpl;
import cn.creditmanage.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class ReputationServlet extends HttpServlet {
    
    ReputationService reputationService = new ReputationServiceImpl();
    
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
        reputationService.delete(Integer.parseInt(req.getParameter("reid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        reputationService.update(getReputationByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPage(Integer.parseInt(request.getParameter("page")));
        pageInfo.setSize(Integer.parseInt(request.getParameter("rows")));
        return JSON.toJSONString(reputationService.list(pageInfo));
    }

    public String addtion(HttpServletRequest request){
        reputationService.insert(getReputationByRequest(request));
        return JSON.toJSONString("successful");
    }

    public Reputation getReputationByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        Reputation reputation = new Reputation();
        if (parameterMap.get("reid")!=null && parameterMap.get("reid").length > 0){
            reputation.setReid((Integer.parseInt(parameterMap.get("reid")[0])));
        }
        if (parameterMap.get("rescore")!=null && parameterMap.get("rescore").length > 0){
            reputation.setRescore(Integer.parseInt(parameterMap.get("rescore")[0]));
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            reputation.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("paytuition")!=null &&parameterMap.get("paytuition").length > 0){
            reputation.setPaytuition(parameterMap.get("paytuition")[0]);
        }
        if (parameterMap.get("nationalloan")!=null &&parameterMap.get("nationalloan").length > 0){
            reputation.setNationalloan(parameterMap.get("nationalloan")[0]);
        }
        if (parameterMap.get("other")!=null &&parameterMap.get("other").length > 0){
            reputation.setOther(parameterMap.get("other")[0]);
        }
        return reputation;
    }
}
