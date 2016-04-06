package com.planrest.dao.impl;

import com.planrest.dao.ItemDao;
import com.planrest.models.Role;
import org.hibernate.SessionFactory;

import java.util.List;

public class RoleDao implements ItemDao<Role> {

    private SessionFactory sessionFactory = getSessionFactory;

    @Override
    public List<Role> getAll() {
        return null;
    }

    @Override
    public Role getById(Long id) {
        return null;
    }

    @Override
    public void add(Role model) {

    }

    @Override
    public void update(Role model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Role model) {

    }
}
