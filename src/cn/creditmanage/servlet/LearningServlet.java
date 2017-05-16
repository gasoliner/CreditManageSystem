package cn.creditmanage.servlet;

import cn.creditmanage.po.LearningAbility;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.service.LearningService;
import cn.creditmanage.service.impl.LearningServiceImpl;
import cn.creditmanage.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class LearningServlet extends HttpServlet {
    
    private LearningService learningService = new LearningServiceImpl();
    
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
        learningService.delete(Integer.parseInt(req.getParameter("laid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        learningService.update(getLearningAbilityByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPage(Integer.parseInt(request.getParameter("page")));
        pageInfo.setSize(Integer.parseInt(request.getParameter("rows")));
        return JSON.toJSONString(learningService.list(pageInfo));
    }

    public String addtion(HttpServletRequest request){
        learningService.insert(getLearningAbilityByRequest(request));
        return JSON.toJSONString("successful");
    }

    public LearningAbility getLearningAbilityByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        LearningAbility learningAbility = new LearningAbility();
        if (parameterMap.get("laid")!=null && parameterMap.get("laid").length > 0){
            learningAbility.setLaid((Integer.parseInt(parameterMap.get("laid")[0])));
        }
        if (parameterMap.get("lascore")!=null && parameterMap.get("lascore").length > 0){
            learningAbility.setLascore(Integer.parseInt(parameterMap.get("lascore")[0]));
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            learningAbility.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("jidian")!=null &&parameterMap.get("jidian").length > 0){
            learningAbility.setJidian(Float.valueOf(parameterMap.get("jidian")[0]));
        }
        if (parameterMap.get("losemajor")!=null &&parameterMap.get("losemajor").length > 0){
            learningAbility.setLosemajor(Integer.valueOf(parameterMap.get("losemajor")[0]));
        }
        if (parameterMap.get("scholarship")!=null &&parameterMap.get("scholarship").length > 0){
            learningAbility.setScholarship(parameterMap.get("scholarship")[0]);
        }
        if (parameterMap.get("ranking")!=null &&parameterMap.get("ranking").length > 0){
            learningAbility.setRanking(Integer.parseInt(parameterMap.get("ranking")[0]));
        }
        return learningAbility;
    }
}
