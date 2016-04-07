package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Visitor;

import java.util.List;

public class VisitorDao extends HibernatedDao<Visitor> {

    public List<Visitor> getAllVisitor() {
        return getAll(Visitor.class);
    }
}
