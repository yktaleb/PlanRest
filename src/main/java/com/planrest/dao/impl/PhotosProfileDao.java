package com.planrest.dao.impl;

import com.planrest.dao.ItemDao;
import com.planrest.models.PhotosProfile;
import org.hibernate.SessionFactory;

import java.util.List;

public class PhotosProfileDao implements ItemDao<PhotosProfile>{

    private SessionFactory sessionFactory = getSessionFactory;

    @Override
    public List<PhotosProfile> getAll() {
        return null;
    }

    @Override
    public PhotosProfile getById(Long id) {
        return null;
    }

    @Override
    public void add(PhotosProfile model) {

    }

    @Override
    public void update(PhotosProfile model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void remove(PhotosProfile model) {

    }
}
