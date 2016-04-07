package com.planrest.dao;

import com.planrest.dao.impl.ProfileDao;
import com.planrest.models.Profile;

public class Main {
    public static void main(String[] args) {
        Profile yarik = new Profile("1348", "yarik@gmail.com", "man", "Yarik", "Taleb");
        Profile ivan = new Profile("1234", "ivango@gmail.com", "man", "Ivan", "Pavlychenko");
        Profile dima = new Profile("1134", "dimas@gmail.com", "man", "Dima", "Zakharchuk");
        Profile leha = new Profile("1004", "leha@gmail.com", "man", "Leha", "Smolar");

        ProfileDao profileDao = new ProfileDao();
        profileDao.add(yarik);
        profileDao.add(ivan);
        profileDao.add(dima);
        profileDao.add(leha);
    }
}
