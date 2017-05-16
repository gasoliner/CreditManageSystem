package cn.creditmanage.service;

import cn.creditmanage.po.LearningAbility;
import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.Reputation;

import java.util.List;

public interface ReputationService {
    public List<Reputation> list(PageInfo pageInfo);

    public void insert(Reputation record);

    public void delete(int reid);

    public void update(Reputation record);
}
