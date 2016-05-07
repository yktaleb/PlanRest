package com.planrest;

import com.planrest.dao.impl.*;
import com.planrest.models.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Profile yarik = new Profile("1348", "yarik@gmail.com", "man", "Yarik", "Taleb");
//        Profile ivan = new Profile("1234", "ivango@gmail.com", "man", "Ivan", "Pavlychenko");
//        Profile dima = new Profile("1134", "dimas@gmail.com", "man", "Dima", "Zakharchuk");
//        Profile leha = new Profile("1004", "leha@gmail.com", "man", "Leha", "Smolar");
//
//        ProfileDao profileDao = new ProfileDao();
//        profileDao.add(yarik);
//        profileDao.add(ivan);
//        profileDao.add(dima);
//        profileDao.add(leha);

//        ProfileDao userDao = new ProfileDao();
//        Profile profileById = userDao.getProfileById(1L);
//        System.out.println(profileById.getEmail());
//
//        UserDao userDao = new UserDao();
//        userDao.add(new User("Yarik", "232", true));


//        GroupMembersDao groupMembersDao = new GroupMembersDao();
//        GroupDao groupDao = new GroupDao();
//        GroupMembers groupMembers = new GroupMembers("Ivan", groupDao.getById(2L));
//        groupMembersDao.add(groupMembers);

//        ProfileDao profileDao = new ProfileDao();
//        if (profileDao.isThere("yarik.taleb@gmail.com")){
//            System.out.println("There");
//        } else {
//            System.out.println("NO");
//        }

//        ProfileDao profileDao = new ProfileDao();
//        profileDao.changePassword("4321", "dimas@gmail.com");

//        InstitutionDao institutionDao = new InstitutionDao();
//        List<Institution> allInstitution = institutionDao.getAllInstitution();
//
//        for (Institution institution : allInstitution) {
//            System.out.println(institution.getAddress());
//        }

//        Institution institution1 = new Institution("first", "04444556", "Solom", "<maahch");
//        Institution institution2 = new Institution("second", "04444556", "Solom", "<maahch");
//        Institution institution3 = new Institution("third", "04444556", "Solom", "<maahch");
//
//
//
//        institution1.setServices();
    }
}
