package cn.creditmanage.mapper;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.RewardPunishment;
import cn.creditmanage.po.RewardPunishmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RewardPunishmentMapper {
    long countByExample(RewardPunishmentExample example);

    int deleteByExample(RewardPunishmentExample example);

    int deleteByPrimaryKey(Integer rpid);

    int insert(RewardPunishment record);

    int insertSelective(RewardPunishment record);

    List<RewardPunishment> selectByExample(RewardPunishmentExample example);

    RewardPunishment selectByPrimaryKey(Integer rpid);

    int updateByExampleSelective(@Param("record") RewardPunishment record, @Param("example") RewardPunishmentExample example);

    int updateByExample(@Param("record") RewardPunishment record, @Param("example") RewardPunishmentExample example);

    int updateByPrimaryKeySelective(RewardPunishment record);

    int updateByPrimaryKey(RewardPunishment record);

    List<RewardPunishment> selectAllReward(PageInfo pageInfo);
}