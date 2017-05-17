package cn.creditmanage.servlet;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.service.AllService;
import cn.creditmanage.service.BasicService;
import cn.creditmanage.service.impl.AllServiceImpl;
import cn.creditmanage.service.impl.BasicServiceImpl;
import cn.creditmanage.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AllServlet extends HttpServlet {

    private AllService allService = new AllServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestName = PageUtil.getRequestName(req.getRequestURL().toString());
        if (requestName.equals("list")){
            resp.getWriter().print(list(req));
        }
    }

    public String list(HttpServletRequest request){
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPage(Integer.parseInt(request.getParameter("page")));
        pageInfo.setSize(Integer.parseInt(request.getParameter("rows")));
        return JSON.toJSONString(allService.list(pageInfo));
    }

}
