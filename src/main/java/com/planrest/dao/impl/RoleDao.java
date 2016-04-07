package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Role;

import java.util.List;

public class RoleDao extends HibernatedDao<Role> {

    public List<Role> getAllRole() {
        return getAll(Role.class);
    }
}
