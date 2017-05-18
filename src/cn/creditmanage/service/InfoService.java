package cn.creditmanage.service;

import cn.creditmanage.po.Student;
import cn.creditmanage.po.Teacher;

public interface InfoService {

    public void update_teacher(Teacher teacher);

    public void update_student(Student student);

    public boolean updatePassword(String newPassword1,String newPassword2,String oldPassword,int id,int rid);

}
