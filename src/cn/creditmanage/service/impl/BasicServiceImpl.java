package cn.creditmanage.service.impl;

import cn.creditmanage.mapper.BasicSituationMapper;
import cn.creditmanage.po.BasicSituation;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.service.BasicService;
import cn.creditmanage.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BasicServiceImpl implements BasicService {


    public BasicServiceImpl() {
    }

    @Override
    public List<BasicSituation> list(PageInfo pageInfo) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        BasicSituationMapper basicSituationMapper = sqlSession.getMapper(BasicSituationMapper.class);
        pageInfo.setStart((pageInfo.getPage()-1)*pageInfo.getSize());
        List<BasicSituation> basicSituationList = basicSituationMapper.selectAllBasic(pageInfo);
        sqlSession.close();
        return basicSituationList;
    }

    @Override
    public void insert(BasicSituation record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        BasicSituationMapper basicSituationMapper = sqlSession.getMapper(BasicSituationMapper.class);
//        record.setBsscore((record.getClassmatescore()+record.getTeacherscore())/2);
        basicSituationMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int bsid) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        BasicSituationMapper basicSituationMapper = sqlSession.getMapper(BasicSituationMapper.class);
        basicSituationMapper.deleteByPrimaryKey(bsid);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(BasicSituation record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        BasicSituationMapper basicSituationMapper = sqlSession.getMapper(BasicSituationMapper.class);
        basicSituationMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }
}
