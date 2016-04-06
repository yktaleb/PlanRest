package com.planrest.dao.impl;


import com.planrest.dao.HibernateUtil;
import com.planrest.dao.ItemDao;
import com.planrest.models.Institution;
import org.hibernate.SessionFactory;

import java.util.List;

public class InstitutionDao implements ItemDao<Institution> {

    private SessionFactory sessionFactory = getSessionFactory;

    @Override
    public List<Institution> getAll() {
        return null;
    }

    @Override
    public Institution getById(Long id) {
        return null;
    }

    @Override
    public void add(Institution model) {

    }

    @Override
    public void update(Institution model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(Institution model) {

    }
}
