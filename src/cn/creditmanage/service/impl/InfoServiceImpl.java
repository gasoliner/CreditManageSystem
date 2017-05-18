package cn.creditmanage.service.impl;

import cn.creditmanage.mapper.StudentMapper;
import cn.creditmanage.mapper.TeacherMapper;
import cn.creditmanage.po.Student;
import cn.creditmanage.po.Teacher;
import cn.creditmanage.service.InfoService;
import cn.creditmanage.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

public class InfoServiceImpl implements InfoService {

    @Override
    public void update_teacher(Teacher teacher) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        teacherMapper.updateByPrimaryKeySelective(teacher);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update_student(Student student) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.updateByPrimaryKeySelective(student);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public boolean updatePassword(String newPassword1, String newPassword2, String oldPassword, int id,int rid) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        if (rid == 1){
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            if (teacherMapper.selectByPrimaryKey(id).getPassword().equals(oldPassword)){
                if (newPassword1.equals(newPassword2)){
                    Teacher teacher = new Teacher();
                    teacher.setPassword(newPassword1);
                    teacher.setTid(id);
                    teacherMapper.updateByPrimaryKeySelective(teacher);
                    sqlSession.commit();
                    sqlSession.close();
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else if (rid == 2){
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            if (studentMapper.selectByPrimaryKey(id).getPassword().equals(oldPassword)){
                if (newPassword1.equals(newPassword2)){
                    Student student = new Student();
                    student.setPassword(newPassword1);
                    student.setSid(id);
                    studentMapper.updateByPrimaryKeySelective(student);
                    sqlSession.commit();
                    sqlSession.close();
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }
        return false;
    }
}
