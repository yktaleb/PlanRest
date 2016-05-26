package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Institution;

import java.util.ArrayList;
import java.util.List;

public class InstitutionDao extends HibernatedDao<Institution> {

    public List<Institution> getAllInstitution() {
        return getAll(Institution.class);
    }

    public Institution getInstitutionById(Long id) {
        Institution institution = null;
        for (Institution object : getAllInstitution()) {
            if (id == object.getId()) {
                institution = object;
            }
        }
        return institution;
    }

    public ArrayList<Institution> getInstitutionsByName(String name) {
        name = name.toUpperCase();
        int length = name.length();
        ArrayList<Institution> institutions = new ArrayList<Institution>();
        for (Institution institution : getAllInstitution()) {
            if (institution.getName().toUpperCase().equals(name)) {
                institutions.add(institution);
            }
        }
        return institutions;
    }

}
