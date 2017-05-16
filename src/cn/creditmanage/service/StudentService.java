package cn.creditmanage.service;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.Student;

import java.util.List;


public interface StudentService {

    public List<Student> getStudentList(PageInfo pageInfo);

    public void insert(Student record);

    public void delete(int sid);

    public void update(Student record);
}
