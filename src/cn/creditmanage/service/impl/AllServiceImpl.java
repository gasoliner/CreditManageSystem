package cn.creditmanage.service.impl;

import cn.creditmanage.mapper.AllCreditMapper;
import cn.creditmanage.po.AllCredit;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.service.AllService;
import cn.creditmanage.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class AllServiceImpl implements AllService {
    @Override
    public List<AllCredit> list(PageInfo pageInfo) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        AllCreditMapper allCreditMapper = sqlSession.getMapper(AllCreditMapper.class);
        pageInfo.setStart((pageInfo.getPage()-1)*pageInfo.getSize());
        List<AllCredit> allCreditList = allCreditMapper.selectAllCredit(pageInfo);
        sqlSession.close();
        for (AllCredit allCredit:
                allCreditList){
            allCredit.setAllscore(
                    allCredit.getBsscore()+allCredit.getLascore()+allCredit.getRescore()+allCredit.getRpscore()+allCredit.getTwscore()
            );
        }
        return allCreditList;
    }
}
