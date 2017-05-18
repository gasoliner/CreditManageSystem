package cn.creditmanage.service;

import cn.creditmanage.po.Student;
import cn.creditmanage.po.Teacher;
import cn.creditmanage.po.User;

public interface LogService {

    public boolean studentLogin(User user);

    public boolean teacherLogin(User user);

    public Student getStudentByUserName(String username);

    public Teacher getTeacherByUserName(String username);

}
