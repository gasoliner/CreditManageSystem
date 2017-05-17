package cn.creditmanage.servlet;

import cn.creditmanage.util.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UIServlet extends HttpServlet {

    public UIServlet() throws IOException {
        PageUtil pageUtil = new PageUtil();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURL().toString();
        String ui = PageUtil.getRequestName(url);
        if (ui.equals("sign")){
            System.out.println("查看sign");
            req.getRequestDispatcher("/WEB-INF/jsp/"+ui+".jsp").forward(req,resp);
        }else {
            if (req.getSession().getAttribute("user") != null){
                System.out.println("已登录");
                req.getRequestDispatcher("/WEB-INF/jsp/"+ui+".jsp").forward(req,resp);
            }else {
                System.out.println("未登录，将跳转到sign");
                resp.sendRedirect("/UI/sign");
//                req.getRequestDispatcher("/WEB-INF/jsp/"+"sign"+".jsp").forward(req,resp);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
