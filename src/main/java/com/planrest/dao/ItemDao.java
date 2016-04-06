package com.planrest.dao;

import com.planrest.models.Model;
import org.hibernate.SessionFactory;

import java.util.List;

public interface ItemDao<T extends Model> {

    public List<T> getAll();

    public T getById(Long id);

    public void add (T model);

    public void update(T model);

    public void remove(Long id);

    public void remove(T model);

    SessionFactory getSessionFactory = HibernateUtil.getSessionfactory();
}
