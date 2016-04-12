package com.planrest.dao.impl;

import com.planrest.dao.HibernateUtil;
import com.planrest.dao.HibernatedDao;
import com.planrest.models.Profile;
import com.planrest.models.User;

import java.util.List;

public class ProfileDao extends HibernatedDao<Profile> {

    public List<Profile> getAllProfile() {
        return getAll(Profile.class);
    }

    @Override
    public Profile getById(Long id) {
        Profile user = null;
        try {
            startOperation();
            user = (Profile) session.get(Profile.class, id);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(getSession());
        }
        return user;
    }

}
