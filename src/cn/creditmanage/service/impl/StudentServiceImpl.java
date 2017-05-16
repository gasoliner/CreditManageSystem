package cn.creditmanage.service.impl;

import cn.creditmanage.mapper.StudentMapper;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.Student;
import cn.creditmanage.service.StudentService;
import cn.creditmanage.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;


//sqlSession是线程不安全的

public class StudentServiceImpl implements StudentService {

//    private static SqlSessionFactory sqlSessionFactory;

    public StudentServiceImpl() throws IOException {
    }

    @Override
    public List<Student> getStudentList(PageInfo pageInfo) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        pageInfo.setStart((pageInfo.getPage()-1)*pageInfo.getSize());
        List<Student> studentList = studentMapper.selectAllStudent(pageInfo);
        sqlSession.close();
        return studentList;
    }

    @Override
    public void insert(Student record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int sid) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.deleteByPrimaryKey(sid);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Student record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }
}
