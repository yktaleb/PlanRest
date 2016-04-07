package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Profile;

import java.util.List;

public class ProfileDao extends HibernatedDao<Profile> {

    public List<Profile> getAllProfile() {
        return getAll(Profile.class);
    }
}
