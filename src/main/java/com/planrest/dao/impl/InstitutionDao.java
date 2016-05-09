package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Institution;

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

}
