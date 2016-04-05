package com.planrest.dao;

import com.planrest.models.Profile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionfactory = HibernateUtil.getSessionfactory();

        Session session = sessionfactory.openSession();
        try {
            session.beginTransaction();

//            SQLQuery query = session.createSQLQuery("INSERT INTO planrest.profile VALUES (1, '2e2','efpl', NULL , 'Yarik', 'Taleb', NULL, NULL, NULL, NULL, NULL, NULL,NULL, NULL, NULL, NULL)");
//            query.executeUpdate();

            Profile yarik = new Profile("1348", "yarik@gmail.com", "man", "Yarik", "Taleb");
            Profile ivan = new Profile("1234", "ivango@gmail.com", "man", "Ivan", "Pavlychenko");
            Profile dima = new Profile("1134", "dimas@gmail.com", "man", "Dima", "Zakharchuk");
            Profile leha = new Profile("1004", "leha@gmail.com", "man", "Leha", "Smolar");

//            SQLQuery query = session.createSQLQuery("SELECT id FROM profile where email = 'yarik@gmail.com'");
//            System.out.println(query.list());

            session.save(yarik);
            session.save(ivan);
            session.save(dima);
            session.save(leha);

//            //Friends for Yarik
//            Friend friend = new Friend(ivan);
//            Friend friend1 = new Friend(dima);
//            friend.setProfile(yarik);
//            friend1.setProfile(yarik);
//
//            List<Friend> friendsForYarik = new ArrayList<Friend>();
//            friendsForYarik.add(friend);
//            friendsForYarik.add(friend1);
//
//            yarik.setFriends(friendsForYarik);
//
//            //Friends for Leha
//            Friend friend2 = new Friend(ivan);
//            friend2.setProfile(leha);
//
//            List<Friend> friendsForLeha = new ArrayList<Friend>();
//            friendsForLeha.add(friend2);
//
//            leha.setFriends(friendsForLeha);
//
//            session.save(yarik);
//            session.save(ivan);
//            session.save(dima);
//            session.save(leha);


//            List<PhotosProfile> photosProfiles = new ArrayList<PhotosProfile>();
//            PhotosProfile photo1 = new PhotosProfile(new byte[]{2, 111, 0});
//            PhotosProfile photo2 = new PhotosProfile(new byte[]{2, 5, 9, 3, 1});
//            photo1.setProfile(yarik);
//            photo2.setProfile(yarik);
//            photosProfiles.add(photo1);
//            photosProfiles.add(photo2);
//            yarik.setPhotosProfiles(photosProfiles);
//            session.save(yarik);

            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
            sessionfactory.close();
        }

    }

}
