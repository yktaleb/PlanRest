package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Institution;
import com.planrest.models.Kitchen;
import com.planrest.models.Service;

import java.util.ArrayList;
import java.util.List;


public class ServiceDao extends HibernatedDao<Service> {
    public List<Service> getAllService() {
        return getAll(Service.class);
    }


    public ArrayList<Institution> getAllInstitutionByTypeTitle(String title) {
        ArrayList<Institution> institutions = new ArrayList<Institution>();
        for (Service service : getAllService()) {
            if (title.equals(service.getTitle())) {
                institutions.add(service.getInstitution());
            }
        }
        return institutions;
    }

    public ArrayList<String> getServiceListByInstitutionId(Long institutionId) {
        ArrayList<String> services = new ArrayList<String>();
        for (Service service : getAllService()) {
            if (service.getInstitution().getId().equals(institutionId)) {
                services.add(service.getTitle());
            }
        }
        return services;
    }
}
