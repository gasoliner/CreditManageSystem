package cn.creditmanage.service;

import cn.creditmanage.po.PageInfo;
import cn.creditmanage.po.RewardPunishment;

import java.util.List;

public interface RewardService {
    public List<RewardPunishment> list(PageInfo pageInfo);

    public void insert(RewardPunishment record);

    public void delete(int rpid);

    public void update(RewardPunishment record);
}
