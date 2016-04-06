package com.planrest.dao.impl;

import com.planrest.dao.ItemDao;
import com.planrest.models.Friend;
import org.hibernate.SessionFactory;

import java.util.List;

public class FriendDao implements ItemDao<Friend>{

    private SessionFactory sessionFactory = getSessionFactory;

    @Override
    public List<Friend> getAll() {
        return null;
    }

    @Override
    public Friend getById(Long id) {
        return null;
    }

    @Override
    public void add(Friend model) {

    }

    @Override
    public void update(Friend model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Friend model) {

    }
}

