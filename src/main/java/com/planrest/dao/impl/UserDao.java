package com.planrest.dao.impl;

import com.planrest.dao.HibernateUtil;
import com.planrest.dao.HibernatedDao;
import com.planrest.models.User;
import org.hibernate.Hibernate;

import java.util.List;

public class UserDao extends HibernatedDao<User>{

    public List<User> getAllUser() {
        return getAll(User.class);
    }

}
