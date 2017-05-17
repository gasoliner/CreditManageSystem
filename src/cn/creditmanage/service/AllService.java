package cn.creditmanage.service;

import cn.creditmanage.po.AllCredit;
import cn.creditmanage.po.PageInfo;

import java.util.List;


public interface AllService {

    public List<AllCredit> list(PageInfo pageInfo);

}
