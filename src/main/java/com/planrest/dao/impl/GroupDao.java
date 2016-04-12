package com.planrest.dao.impl;

import com.planrest.dao.HibernateUtil;
import com.planrest.dao.HibernatedDao;
import com.planrest.models.Group;

import java.util.List;

public class GroupDao extends HibernatedDao<Group>{

    public List<Group> getAllGroup() {
        return getAll(Group.class);
    }

    @Override
    public Group getById(Long id) {
        Group group = null;
        try {
            startOperation();
            group = (Group) session.get(Group.class, id);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(getSession());
        }
        return group;
    }

}
