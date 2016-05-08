package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.KitchenList;

import java.util.List;


public class KitchenListDao extends HibernatedDao<KitchenList> {
    public List<KitchenList> getAllKitchenList() {
        return getAll(KitchenList.class);
    }

    public String[] getAllTitle() {
        String[] names = new String[getAllKitchenList().size()];
        for (int i = 0; i < getAllKitchenList().size(); i++) {
            names[i] = getAllKitchenList().get(i).getTitle();
        }
        return names;
    }
}
