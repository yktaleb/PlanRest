package com.planrest.dao.impl;


import com.planrest.dao.ItemDao;
import com.planrest.models.CategoryOfInstitution;
import org.hibernate.SessionFactory;

import java.util.List;

public class CategoryOfInstitutionDao implements ItemDao<CategoryOfInstitution> {

    private SessionFactory sessionFactory = getSessionFactory;

    @Override
    public List<CategoryOfInstitution> getAll() {
        return null;
    }

    @Override
    public CategoryOfInstitution getById(Long id) {
        return null;
    }

    @Override
    public void add(CategoryOfInstitution model) {

    }

    @Override
    public void update(CategoryOfInstitution model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(CategoryOfInstitution model) {

    }
}
