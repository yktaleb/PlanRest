package com.planrest.dao.impl;

import com.planrest.dao.ItemDao;
import com.planrest.models.ActivityHistory;
import org.hibernate.SessionFactory;

import java.util.List;

public class ActivityHistoryDao implements ItemDao<ActivityHistory>{

    private SessionFactory sessionFactory = getSessionFactory;

    @Override
    public List<ActivityHistory> getAll() {
        return null;
    }

    @Override
    public ActivityHistory getById(Long id) {
        return null;
    }

    @Override
    public void add(ActivityHistory model) {

    }

    @Override
    public void update(ActivityHistory model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(ActivityHistory model) {

    }
}
