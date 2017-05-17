package cn.creditmanage.mapper;

import cn.creditmanage.po.AllCredit;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.Student;
import cn.creditmanage.po.Teacher;

import java.util.List;

/**
 * Created by 万洪基 on 2017/5/16.
 */
public interface LogMapper {

    Student selectStudentByUsername (String username);

    Teacher selectTeacherByUsername (String username);
}
