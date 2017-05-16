package cn.creditmanage.service.impl;


import cn.creditmanage.mapper.LearningAbilityMapper;
import cn.creditmanage.po.LearningAbility;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.service.LearningService;
import cn.creditmanage.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class LearningServiceImpl implements LearningService {

    @Override
    public List<LearningAbility> list(PageInfo pageInfo) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        LearningAbilityMapper learningAbilityMapper = sqlSession.getMapper(LearningAbilityMapper.class);
        pageInfo.setStart((pageInfo.getPage()-1)*pageInfo.getSize());
        List<LearningAbility> learningAbilityList = learningAbilityMapper.selectAllLearning(pageInfo);
        sqlSession.close();
        return learningAbilityList;
    }

    @Override
    public void insert(LearningAbility record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        LearningAbilityMapper learningAbilityMapper = sqlSession.getMapper(LearningAbilityMapper.class);
        learningAbilityMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int laid) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        LearningAbilityMapper learningAbilityMapper = sqlSession.getMapper(LearningAbilityMapper.class);
        learningAbilityMapper.deleteByPrimaryKey(laid);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(LearningAbility record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        LearningAbilityMapper learningAbilityMapper = sqlSession.getMapper(LearningAbilityMapper.class);
        learningAbilityMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }
}
