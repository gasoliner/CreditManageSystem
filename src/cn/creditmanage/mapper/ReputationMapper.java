package cn.creditmanage.mapper;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.Reputation;
import cn.creditmanage.po.ReputationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReputationMapper {
    long countByExample(ReputationExample example);

    int deleteByExample(ReputationExample example);

    int deleteByPrimaryKey(Integer reid);

    int insert(Reputation record);

    int insertSelective(Reputation record);

    List<Reputation> selectByExample(ReputationExample example);

    Reputation selectByPrimaryKey(Integer reid);

    int updateByExampleSelective(@Param("record") Reputation record, @Param("example") ReputationExample example);

    int updateByExample(@Param("record") Reputation record, @Param("example") ReputationExample example);

    int updateByPrimaryKeySelective(Reputation record);

    int updateByPrimaryKey(Reputation record);

    List<Reputation> selectAllReputation(PageInfo pageInfo);
}