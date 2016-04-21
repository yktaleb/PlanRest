package com.planrest.dao;

import com.planrest.models.Model;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.mapping.Column;
import org.hibernate.mapping.Table;

import java.util.List;

public abstract class HibernatedDao<T extends Model> implements AbstractDao<T> {

    public HibernatedDao() {
        HibernateUtil.buildIfNeeded();
    }

    protected Session session;
    protected Transaction transaction;


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

//    @Override
//    public void remove(Class cl, Long id) {
//        try {
//            startOperation();
//            session.delete(getById(cl, id));
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            HibernateUtil.closeSession(session);
//        }
//    }


    @Override
    public void remove(Class cl, Long id) {

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

//    @Override
//    public T getById(Class cl, Long id) {
//        T onject = null;
//        try {
//            startOperation();
//            onject = (T) session.get(cl, id);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            HibernateUtil.closeSession(session);
//        }
//        return onject;
//    }

//    public abstract T getById(Long id);

    @Override
    public T getById(Long id) {
        return null;
    }

    protected void startOperation() {
        session = HibernateUtil.openSession();
        transaction = session.beginTransaction();
    }

    @Override
    public void updateValue(Table table, Column column, String value, String where, String whereValue) {
        try {
            startOperation();
            Query query = session.createSQLQuery("UPDATE :table SET :column = :value WHERE :where = :whereValue");
            query.setParameter("table", table);
            query.setParameter("column", column);
            query.setParameter("value", value);
            query.setParameter("value", value);
            query.setParameter("where", where);
            query.setParameter("whereValue", whereValue);
            query.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(session);
        }
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
