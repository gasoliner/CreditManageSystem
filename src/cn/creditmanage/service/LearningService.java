package cn.creditmanage.service;

import cn.creditmanage.po.BasicSituation;
import cn.creditmanage.po.LearningAbility;
import cn.creditmanage.po.PageInfo;

import java.util.List;

public interface LearningService {
    public List<LearningAbility> list(PageInfo pageInfo);

    public void insert(LearningAbility record);

    public void delete(int laid);

    public void update(LearningAbility record);
}
