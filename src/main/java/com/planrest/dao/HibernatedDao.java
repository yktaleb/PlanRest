package com.planrest.dao;

import com.planrest.models.Model;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Objects;

public abstract class HibernatedDao<T extends Model> implements AbstractDao<T> {

    public HibernatedDao() {
        HibernateUtil.buildIfNeeded();
    }

    private Session session;
    private Transaction transaction;


    @Override
    public void add(T model) {
        try {
            startOperation();
            session.save(model);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(session);
        }
    }

    @Override
    public void remove(T model) {
        try {
            startOperation();
            session.delete(model);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(session);
        }
    }

    @Override
    public void remove(Class cl, Long id) {
        try {
            startOperation();
            session.delete(getById(cl, id));
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(session);
        }
    }

    @Override
    public void update(T model) {
        try {
            startOperation();
            session.update(model);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(session);
        }
    }

    @Override
    public List<T> getAll(Class cl) {
        List objects = null;
        try {
            startOperation();
            Query query = session.createSQLQuery("from " + cl.getName());
            objects = query.list();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(session);
        }
        return objects;
    }

    @Override
    public T getById(Class cl, Long id) {
        T onject = null;
        try {
            startOperation();
            onject = (T) session.load(cl, id);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(session);
        }
        return onject;
    }

    private void startOperation() {
        session = HibernateUtil.openSession();
        transaction = session.beginTransaction();
    }
}
