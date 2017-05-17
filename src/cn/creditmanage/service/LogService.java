package cn.creditmanage.service;

import cn.creditmanage.po.User;

/**
 * Created by 万洪基 on 2017/5/16.
 */
public interface LogService {

    public boolean studentLogin(User user);

    public boolean teacherLogin(User user);
}
