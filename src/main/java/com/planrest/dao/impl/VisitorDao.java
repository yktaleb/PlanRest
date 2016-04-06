package com.planrest.dao.impl;

import com.planrest.dao.ItemDao;
import com.planrest.models.Visitor;
import org.hibernate.SessionFactory;

import java.util.List;

public class VisitorDao implements ItemDao<Visitor>{

    private SessionFactory sessionFactory = getSessionFactory;

    @Override
    public List<Visitor> getAll() {
        return null;
    }

    @Override
    public Visitor getById(Long id) {
        return null;
    }

    @Override
    public void add(Visitor model) {

    }

    @Override
    public void update(Visitor model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Visitor model) {

    }
}
