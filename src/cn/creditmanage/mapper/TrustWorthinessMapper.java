package cn.creditmanage.mapper;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.TrustWorthiness;
import cn.creditmanage.po.TrustWorthinessExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrustWorthinessMapper {
    long countByExample(TrustWorthinessExample example);

    int deleteByExample(TrustWorthinessExample example);

    int deleteByPrimaryKey(Integer twid);

    int insert(TrustWorthiness record);

    int insertSelective(TrustWorthiness record);

    List<TrustWorthiness> selectByExample(TrustWorthinessExample example);

    TrustWorthiness selectByPrimaryKey(Integer twid);

    int updateByExampleSelective(@Param("record") TrustWorthiness record, @Param("example") TrustWorthinessExample example);

    int updateByExample(@Param("record") TrustWorthiness record, @Param("example") TrustWorthinessExample example);

    int updateByPrimaryKeySelective(TrustWorthiness record);

    int updateByPrimaryKey(TrustWorthiness record);

    List<TrustWorthiness> selectAllTrust(PageInfo pageInfo);
}