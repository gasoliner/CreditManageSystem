package cn.creditmanage.mapper;

import cn.creditmanage.po.BasicSituation;
import cn.creditmanage.po.BasicSituationExample;
import cn.creditmanage.po.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasicSituationMapper {
    long countByExample(BasicSituationExample example);

    int deleteByExample(BasicSituationExample example);

    int deleteByPrimaryKey(Integer bsid);

    int insert(BasicSituation record);

    int insertSelective(BasicSituation record);

    List<BasicSituation> selectByExample(BasicSituationExample example);

    BasicSituation selectByPrimaryKey(Integer bsid);

    int updateByExampleSelective(@Param("record") BasicSituation record, @Param("example") BasicSituationExample example);

    int updateByExample(@Param("record") BasicSituation record, @Param("example") BasicSituationExample example);

    int updateByPrimaryKeySelective(BasicSituation record);

    int updateByPrimaryKey(BasicSituation record);


    List<BasicSituation> selectAllBasic(PageInfo pageInfo);
}