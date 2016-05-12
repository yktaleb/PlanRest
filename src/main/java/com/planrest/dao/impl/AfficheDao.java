package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Affiche;
import com.planrest.models.PhotosInstitution;

import java.util.ArrayList;
import java.util.List;

public class AfficheDao extends HibernatedDao<Affiche> {

    public List<Affiche> getAllAffiche() {
        return getAll(Affiche.class);
    }

    public Affiche getAfficheById(Long id) {
        Affiche affiche = null;
        for (Affiche object : getAllAffiche()) {
            if (id == object.getId()) {
                affiche = object;
            }
        }
        return affiche;
    }

    public ArrayList<byte[]> getAffichePhotosByInstitutionId(Long institutionId) {
        ArrayList<byte[]> affiches = new ArrayList<byte[]>();
        for (Affiche affiche : getAllAffiche()) {
            if (affiche.getInstitution().getId().equals(institutionId)) {
                affiches.add(affiche.getPhoto());
            }
        }
        return affiches;
    }

    public ArrayList<Affiche> getAfficheListByInstitutionId(Long institutionId) {
        ArrayList<Affiche> affiches = new ArrayList<Affiche>();
        for (Affiche affiche : getAllAffiche()) {
            if (affiche.getInstitution().getId().equals(institutionId)) {
                affiches.add(affiche);
            }
        }
        return affiches;
    }
}
