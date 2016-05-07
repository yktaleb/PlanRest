package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Affiche;
import com.planrest.models.PhotosInstitution;

import java.util.List;

public class AfficheDao extends HibernatedDao<Affiche> {

    public List<Affiche> getAllAffiche() {
        return getAll(Affiche.class);
    }
}
