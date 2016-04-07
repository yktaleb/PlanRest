package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.PhotosInstitution;

import java.util.List;

public class PhotosInstitutionDao extends HibernatedDao<PhotosInstitution> {

    public List<PhotosInstitution> getAllPhotosInstitution() {
        return getAll(PhotosInstitution.class);
    }
}
