package com.planrest.dao.impl;

import com.planrest.dao.ItemDao;
import com.planrest.models.Profile;
import org.hibernate.SessionFactory;

import java.util.List;

public class ProfileDao implements ItemDao<Profile>{

    private SessionFactory sessionFactory = getSessionFactory;

    @Override
    public List<Profile> getAll() {
        return null;
    }

    @Override
    public Profile getById(Long id) {
        return null;
    }

    @Override
    public void add(Profile model) {

    }

    @Override
    public void update(Profile model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Profile model) {

    }
}
