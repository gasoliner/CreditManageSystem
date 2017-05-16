package cn.creditmanage.service;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.TrustWorthiness;

import java.util.List;

public interface TrustService {
    public List<TrustWorthiness> list(PageInfo pageInfo);

    public void insert(TrustWorthiness record);

    public void delete(int twid);

    public void update(TrustWorthiness record);
}
