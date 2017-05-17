package cn.creditmanage.mapper;

import cn.creditmanage.po.AllCredit;
import cn.creditmanage.po.PageInfo;

import java.util.List;

/**
 * Created by 万洪基 on 2017/5/16.
 */
public interface AllCreditMapper {
    List<AllCredit> selectAllCredit(PageInfo pageInfo);
}
