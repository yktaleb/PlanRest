package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Institution;
import com.planrest.models.Kitchen;
import com.planrest.models.Service;

import java.util.ArrayList;
import java.util.List;


public class KitchenDao  extends HibernatedDao<Kitchen> {

    public List<Kitchen> getAllKitchen() {
        return getAll(Kitchen.class);
    }


    public ArrayList<Institution> getAllInstitutionByTypeTitle(String title) {
        ArrayList<Institution> institutions = new ArrayList<Institution>();
        for (Kitchen kitchen : getAllKitchen()) {
            if (title.equals(kitchen.getTitle())) {
                institutions.add(kitchen.getInstitution());
            }
        }
        return institutions;
    }
}
