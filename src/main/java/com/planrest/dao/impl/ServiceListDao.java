package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.ServiceList;

import java.util.List;


public class ServiceListDao extends HibernatedDao<ServiceList> {
    public List<ServiceList> getAllServiceList() {
        return getAll(ServiceList.class);
    }

    public String[] getAllTitle() {
        String[] names = new String[getAllServiceList().size()];
        for (int i = 0; i < getAllServiceList().size(); i++) {
            names[i] = getAllServiceList().get(i).getTitle();
        }
        return names;
    }
}
