package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.TypeList;

import java.util.List;


public class TypeListDao extends HibernatedDao<TypeList> {
    public List<TypeList> getAllTypeList() {
        return getAll(TypeList.class);
    }

    public String[] getAllTitle() {
        String[] names = new String[getAllTypeList().size()];
        for (int i = 0; i < getAllTypeList().size(); i++) {
            names[i] = getAllTypeList().get(i).getTitle();
        }
        return names;
    }
}
