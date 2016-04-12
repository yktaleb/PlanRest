package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.GroupAuthorities;

import java.util.List;

public class GroupAuthoritiesDao extends HibernatedDao<GroupAuthorities>{

    public List<GroupAuthorities> getAllGroupAuthorities() {
        return getAll(GroupAuthorities.class);
    }
}
