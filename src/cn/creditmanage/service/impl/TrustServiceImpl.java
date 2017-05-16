package cn.creditmanage.service.impl;


import cn.creditmanage.mapper.TrustWorthinessMapper;
import cn.creditmanage.po.TrustWorthiness;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.service.TrustService;
import cn.creditmanage.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TrustServiceImpl implements TrustService {

    @Override
    public List<TrustWorthiness> list(PageInfo pageInfo) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        TrustWorthinessMapper trustWorthinessMapper = sqlSession.getMapper(TrustWorthinessMapper.class);
        pageInfo.setStart((pageInfo.getPage()-1)*pageInfo.getSize());
        List<TrustWorthiness> trustWorthinessList = trustWorthinessMapper.selectAllTrust(pageInfo);
        sqlSession.close();
        return trustWorthinessList;
    }

    @Override
    public void insert(TrustWorthiness record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        TrustWorthinessMapper trustWorthinessMapper = sqlSession.getMapper(TrustWorthinessMapper.class);
        trustWorthinessMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int twid) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        TrustWorthinessMapper trustWorthinessMapper = sqlSession.getMapper(TrustWorthinessMapper.class);
        trustWorthinessMapper.deleteByPrimaryKey(twid);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(TrustWorthiness record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        TrustWorthinessMapper trustWorthinessMapper = sqlSession.getMapper(TrustWorthinessMapper.class);
        trustWorthinessMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }
}
