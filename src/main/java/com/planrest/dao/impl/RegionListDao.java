package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Institution;
import com.planrest.models.KitchenList;
import com.planrest.models.RegionList;

import java.util.List;


public class RegionListDao extends HibernatedDao<RegionList> {

    public List<RegionList> getAllRegionList() {
        return getAll(RegionList.class);
    }

    public String[] getAllTitle() {
        String[] names = new String[getAllRegionList().size()];
        for (int i = 0; i < getAllRegionList().size(); i++) {
            names[i] = getAllRegionList().get(i).getTitle();
        }
        return names;
    }

}
