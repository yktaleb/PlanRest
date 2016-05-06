package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Institution;

import java.util.List;

public class InstitutionDao extends HibernatedDao<Institution> {

    public List<Institution> getAllInstitution() {
        return getAll(Institution.class);
    }

}
