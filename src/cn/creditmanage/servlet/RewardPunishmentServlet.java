package cn.creditmanage.servlet;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.RewardPunishment;
import cn.creditmanage.service.RewardService;
import cn.creditmanage.service.impl.RewardServiceImpl;
import cn.creditmanage.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class RewardPunishmentServlet extends HttpServlet {

    RewardService rewardService = new RewardServiceImpl();

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
        rewardService.delete(Integer.parseInt(req.getParameter("rpid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        rewardService.update(getRewardPunishmentByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPage(Integer.parseInt(request.getParameter("page")));
        pageInfo.setSize(Integer.parseInt(request.getParameter("rows")));
        if (request.getParameter("user") != null){
            pageInfo.setUser(request.getParameter("user"));
        }
        return JSON.toJSONString(rewardService.list(pageInfo));
    }

    public String addtion(HttpServletRequest request){
        rewardService.insert(getRewardPunishmentByRequest(request));
        return JSON.toJSONString("successful");
    }

    public RewardPunishment getRewardPunishmentByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        RewardPunishment rewardPunishment = new RewardPunishment();
        if (parameterMap.get("rpid")!=null && parameterMap.get("rpid").length > 0){
            rewardPunishment.setRpid((Integer.parseInt(parameterMap.get("rpid")[0])));
        }
        if (parameterMap.get("rpscore")!=null && parameterMap.get("rpscore").length > 0){
            rewardPunishment.setRpscore(Integer.parseInt(parameterMap.get("rpscore")[0]));
        }
        if (parameterMap.get("username")!=null &&parameterMap.get("username").length > 0){
            rewardPunishment.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("goodthing")!=null &&parameterMap.get("goodthing").length > 0){
            rewardPunishment.setGoodthing(parameterMap.get("goodthing")[0]);
        }
        if (parameterMap.get("schoolreward")!=null &&parameterMap.get("schoolreward").length > 0){
            rewardPunishment.setSchoolreward(parameterMap.get("schoolreward")[0]);
        }
        if (parameterMap.get("breakrule")!=null &&parameterMap.get("breakrule").length > 0){
            rewardPunishment.setBreakrule(parameterMap.get("breakrule")[0]);
        }
        if (parameterMap.get("breaklaw")!=null &&parameterMap.get("breaklaw").length > 0){
            rewardPunishment.setBreaklaw(parameterMap.get("breaklaw")[0]);
        }
        return rewardPunishment;
    }
}
