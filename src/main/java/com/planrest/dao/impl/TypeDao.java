package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Institution;
import com.planrest.models.Type;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class TypeDao extends HibernatedDao<Type> {

    public List<Type> getAllType() {
        return getAll(Type.class);
    }


    public ArrayList<Institution> getAllInstitutionByTypeTitle(String title) {
        ArrayList<Institution> institutions = new ArrayList<Institution>();
        for (Type type : getAllType()) {
            if (title.equals(type.getTitle())) {
                institutions.add(type.getInstitution());
            }
        }
        return institutions;
    }

}
