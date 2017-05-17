package cn.creditmanage.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by 万洪基 on 2017/5/10.
 */
public class PageUtil {

    private static SqlSessionFactory sqlSessionFactory;

    public PageUtil() throws IOException {
        String resource="SqlMapConfig.xml";
//        String resource="classpath:SqlMapConfig.xml";
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
    }

    public static String getRequestName(String url){
        String []urls =  url.split("/");
        return urls[urls.length-1];
    }

    public static SqlSession openSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static boolean isTeacher(HttpServletRequest request){
        String role = (String) request.getSession().getAttribute("role");
        if (role == "1"){
            return true;
        }else {
            return false;
        }
    }
}
