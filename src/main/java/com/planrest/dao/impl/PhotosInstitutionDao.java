package com.planrest.dao.impl;

import com.planrest.dao.ItemDao;
import com.planrest.models.PhotosInstitution;
import org.hibernate.SessionFactory;

import java.util.List;

public class PhotosInstitutionDao implements ItemDao<PhotosInstitution>{

    private SessionFactory sessionFactory = getSessionFactory;

    @Override
    public List<PhotosInstitution> getAll() {
        return null;
    }

    @Override
    public PhotosInstitution getById(Long id) {
        return null;
    }

    @Override
    public void add(PhotosInstitution model) {

    }

    @Override
    public void update(PhotosInstitution model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(PhotosInstitution model) {

    }
}
