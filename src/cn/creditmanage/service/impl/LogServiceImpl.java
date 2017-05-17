package cn.creditmanage.service.impl;

import cn.creditmanage.mapper.LogMapper;
import cn.creditmanage.po.Student;
import cn.creditmanage.po.Teacher;
import cn.creditmanage.po.User;
import cn.creditmanage.service.LogService;
import cn.creditmanage.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

public class LogServiceImpl implements LogService {
    @Override
    public boolean studentLogin(User user) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        LogMapper logMapper = sqlSession.getMapper(LogMapper.class);
        Student student = logMapper.selectStudentByUsername(user.getUsername());
        if (student != null && student.getPassword().equals(user.getPassword())){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean teacherLogin(User user) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        LogMapper logMapper = sqlSession.getMapper(LogMapper.class);
        Teacher teacher = logMapper.selectTeacherByUsername(user.getUsername());
        if (teacher != null && teacher.getPassword().equals(user.getPassword())){
            return true;
        }else {
            return false;
        }
    }
}
