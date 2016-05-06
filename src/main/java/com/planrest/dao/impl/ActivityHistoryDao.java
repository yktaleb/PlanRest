package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.ActivityHistory;

import java.util.List;

public class ActivityHistoryDao extends HibernatedDao<ActivityHistory> {

    public List<ActivityHistory> getAllActivityHistory() {
        return getAll(ActivityHistory.class);
    }

}
