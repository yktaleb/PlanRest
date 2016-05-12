package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.PhotosInstitution;

import java.util.ArrayList;
import java.util.List;

public class PhotosInstitutionDao extends HibernatedDao<PhotosInstitution> {

    public List<PhotosInstitution> getAllPhotosInstitution() {
        return getAll(PhotosInstitution.class);
    }

    public PhotosInstitution getPhotoInstitutionById(Long id) {
        PhotosInstitution photosInstitution = null;
        for (PhotosInstitution object : getAllPhotosInstitution()) {
            if (id == object.getId()) {
                photosInstitution = object;
            }
        }
        return photosInstitution;
    }

    public ArrayList<PhotosInstitution> getPhotosInstitutionListByInstitutionId(Long institutionId) {
        ArrayList<PhotosInstitution> photosInstitutions = new ArrayList<PhotosInstitution>();
        for (PhotosInstitution photosInstitution : getAllPhotosInstitution()) {
            if (photosInstitution.getInstitution().getId().equals(institutionId)) {
                photosInstitutions.add(photosInstitution);
            }
        }
        return photosInstitutions;
    }
}
