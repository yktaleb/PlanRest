package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.GroupMembers;

import java.util.List;

public class GroupMembersDao extends HibernatedDao<GroupMembers>{

    public List<GroupMembers> getAllGroup() {
        return getAll(GroupMembers.class);
    }

}
