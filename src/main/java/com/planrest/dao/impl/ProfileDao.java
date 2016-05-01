package com.planrest.dao.impl;

import com.planrest.dao.HibernateUtil;
import com.planrest.dao.HibernatedDao;
import com.planrest.models.Profile;
import com.planrest.models.User;
import org.hibernate.Query;
import org.hibernate.mapping.Column;
import org.hibernate.mapping.Table;


import java.util.List;

public class ProfileDao extends HibernatedDao<Profile> {

    private static boolean isThere = false;

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

    public boolean isThere(String email) {
        boolean check = false;
        try {
            startOperation();
            List result = session.createSQLQuery("SELECT name FROM profile WHERE email = '" + email + "'").list();
            if (result.size() != 0) {
                check = true;
                isThere = true;
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(getSession());
        }
        return check;
    }

    public void changePassword(String password, String username) {
//        updateValue(new Table("profile"), new Column("password"), password, "email", username);
////        updateValue(new Table("users"), new Column("password"), password, "username", username);

        try {
            startOperation();
            Query query = session.createSQLQuery("UPDATE profile SET password = :password WHERE email = :username");
            query.setParameter("password", password);
            query.setParameter("username", username);
            query.executeUpdate();

            Query query1 = session.createSQLQuery("UPDATE users SET password = :password WHERE username = :username");
            query1.setParameter("password", password);
            query1.setParameter("username", username);
            query1.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(session);
        }
    }

    public static boolean getIsThere() {
        return isThere;
    }

    public static void setIsThere(boolean there) {
        isThere = there;
    }
}
