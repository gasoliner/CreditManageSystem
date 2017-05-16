package cn.creditmanage.mapper;

import cn.creditmanage.po.LearningAbility;
import cn.creditmanage.po.LearningAbilityExample;
import cn.creditmanage.po.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LearningAbilityMapper {
    long countByExample(LearningAbilityExample example);

    int deleteByExample(LearningAbilityExample example);

    int deleteByPrimaryKey(Integer laid);

    int insert(LearningAbility record);

    int insertSelective(LearningAbility record);

    List<LearningAbility> selectByExample(LearningAbilityExample example);

    LearningAbility selectByPrimaryKey(Integer laid);

    int updateByExampleSelective(@Param("record") LearningAbility record, @Param("example") LearningAbilityExample example);

    int updateByExample(@Param("record") LearningAbility record, @Param("example") LearningAbilityExample example);

    int updateByPrimaryKeySelective(LearningAbility record);

    int updateByPrimaryKey(LearningAbility record);

    List<LearningAbility> selectAllLearning(PageInfo pageInfo);
}