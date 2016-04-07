package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.PhotosProfile;

import java.util.List;

public class PhotosProfileDao extends HibernatedDao<PhotosProfile> {

    public List<PhotosProfile> getAllPhotosProfile() {
        return getAll(PhotosProfile.class);
    }
}
