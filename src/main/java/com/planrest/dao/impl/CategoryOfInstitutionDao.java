package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.CategoryOfInstitution;

import java.util.List;

public class CategoryOfInstitutionDao extends HibernatedDao<CategoryOfInstitution> {

    public List<CategoryOfInstitution> getAllCategoryOfInstitution() {
        return getAll(CategoryOfInstitution.class);
    }
}
