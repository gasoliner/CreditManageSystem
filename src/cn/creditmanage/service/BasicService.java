package cn.creditmanage.service;

import cn.creditmanage.po.BasicSituation;
import cn.creditmanage.po.PageInfo;

import java.util.List;

public interface BasicService {
    public List<BasicSituation> list(PageInfo pageInfo);

    public void insert(BasicSituation record);

    public void delete(int bsid);

    public void update(BasicSituation record);
}
