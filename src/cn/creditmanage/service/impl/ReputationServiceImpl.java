package cn.creditmanage.service.impl;


import cn.creditmanage.mapper.ReputationMapper;
import cn.creditmanage.po.Reputation;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.Reputation;
import cn.creditmanage.service.LearningService;
import cn.creditmanage.service.ReputationService;
import cn.creditmanage.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ReputationServiceImpl implements ReputationService {

    @Override
    public List<Reputation> list(PageInfo pageInfo) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ReputationMapper reputationMapper = sqlSession.getMapper(ReputationMapper.class);
        pageInfo.setStart((pageInfo.getPage()-1)*pageInfo.getSize());
        List<Reputation> reputationList = reputationMapper.selectAllReputation(pageInfo);
        sqlSession.close();
        return reputationList;
    }

    @Override
    public void insert(Reputation record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ReputationMapper reputationMapper = sqlSession.getMapper(ReputationMapper.class);
        reputationMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int reid) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ReputationMapper reputationMapper = sqlSession.getMapper(ReputationMapper.class);
        reputationMapper.deleteByPrimaryKey(reid);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Reputation record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ReputationMapper reputationMapper = sqlSession.getMapper(ReputationMapper.class);
        reputationMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }
}
