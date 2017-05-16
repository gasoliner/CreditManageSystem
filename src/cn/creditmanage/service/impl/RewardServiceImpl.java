package cn.creditmanage.service.impl;


import cn.creditmanage.mapper.RewardPunishmentMapper;
import cn.creditmanage.po.RewardPunishment;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.service.RewardService;
import cn.creditmanage.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RewardServiceImpl implements RewardService {

    @Override
    public List<RewardPunishment> list(PageInfo pageInfo) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        RewardPunishmentMapper rewardPunishmentMapper = sqlSession.getMapper(RewardPunishmentMapper.class);
        pageInfo.setStart((pageInfo.getPage()-1)*pageInfo.getSize());
        List<RewardPunishment> rewardPunishmentList = rewardPunishmentMapper.selectAllReward(pageInfo);
        sqlSession.close();
        return rewardPunishmentList;
    }

    @Override
    public void insert(RewardPunishment record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        RewardPunishmentMapper rewardPunishmentMapper = sqlSession.getMapper(RewardPunishmentMapper.class);
        rewardPunishmentMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int rpid) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        RewardPunishmentMapper rewardPunishmentMapper = sqlSession.getMapper(RewardPunishmentMapper.class);
        rewardPunishmentMapper.deleteByPrimaryKey(rpid);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(RewardPunishment record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        RewardPunishmentMapper rewardPunishmentMapper = sqlSession.getMapper(RewardPunishmentMapper.class);
        rewardPunishmentMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }
}
