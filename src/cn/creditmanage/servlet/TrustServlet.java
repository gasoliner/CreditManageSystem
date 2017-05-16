package cn.creditmanage.servlet;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.TrustWorthiness;
import cn.creditmanage.service.TrustService;
import cn.creditmanage.service.impl.TrustServiceImpl;
import cn.creditmanage.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class TrustServlet extends HttpServlet {
    
    private TrustService trustService = new TrustServiceImpl();
    
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
        trustService.delete(Integer.parseInt(req.getParameter("twid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        trustService.update(getTrustWorthinessByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPage(Integer.parseInt(request.getParameter("page")));
        pageInfo.setSize(Integer.parseInt(request.getParameter("rows")));
        return JSON.toJSONString(trustService.list(pageInfo));
    }

    public String addtion(HttpServletRequest request){
        trustService.insert(getTrustWorthinessByRequest(request));
        return JSON.toJSONString("successful");
    }

    public TrustWorthiness getTrustWorthinessByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        TrustWorthiness trustWorthiness = new TrustWorthiness();
        if (parameterMap.get("twid")!=null && parameterMap.get("twid").length > 0){
            trustWorthiness.setTwid((Integer.parseInt(parameterMap.get("twid")[0])));
        }
        if (parameterMap.get("twscore")!=null && parameterMap.get("twscore").length > 0){
            trustWorthiness.setTwscore(Integer.parseInt(parameterMap.get("twscore")[0]));
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            trustWorthiness.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("activities")!=null &&parameterMap.get("activities").length > 0){
            trustWorthiness.setActivities(parameterMap.get("activities")[0]);
        }
        if (parameterMap.get("iscojob")!=null &&parameterMap.get("iscojob").length > 0){
            trustWorthiness.setIscojob(parameterMap.get("iscojob")[0]);
        }
        if (parameterMap.get("jingdong")!=null &&parameterMap.get("jingdong").length > 0){
            trustWorthiness.setJingdong(parameterMap.get("jingdong")[0]);
        }
        if (parameterMap.get("zhima")!=null &&parameterMap.get("zhima").length > 0){
            trustWorthiness.setZhima(parameterMap.get("zhima")[0]);
        }
        return trustWorthiness;
    }
}
