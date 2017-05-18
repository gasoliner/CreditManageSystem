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
            req.getRequestDispatcher("/WEB-INF/jsp/"+ui+".jsp").forward(req,resp);
        }else {
            if (req.getSession().getAttribute("user") != null){
                req.getRequestDispatcher("/WEB-INF/jsp/"+ui+".jsp").forward(req,resp);
            }else {
                resp.sendRedirect("/UI/sign");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
