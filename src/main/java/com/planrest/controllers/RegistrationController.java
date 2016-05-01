package com.planrest.controllers;

import com.planrest.dao.impl.GroupDao;
import com.planrest.dao.impl.GroupMembersDao;
import com.planrest.dao.impl.ProfileDao;
import com.planrest.dao.impl.UserDao;
import com.planrest.models.GroupMembers;
import com.planrest.models.Profile;
import com.planrest.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
public class RegistrationController {

    @RequestMapping(value="/registration")
    public ModelAndView registration() {
        return new ModelAndView("registration", "profile", new Profile());
    }

    @RequestMapping(value="/check_user")
    public String checkUser(@ModelAttribute Profile profile) {

        ProfileDao profileDao = new ProfileDao();
        if (profileDao.isThere(profile.getEmail())){
            return "registration";
        }

        User user = new User(profile.getEmail(), profile.getPassword(), true);
        UserDao userDao = new UserDao();
        userDao.add(user);

        GroupDao groupDao = new GroupDao();
        GroupMembers groupMembers = new GroupMembers(profile.getEmail(), groupDao.getById(1L));
        GroupMembersDao groupMembersDao = new GroupMembersDao();
        groupMembersDao.add(groupMembers);

        profileDao.add(profile);

//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("check_user");
//        modelAndView.addObject("prof", profile);

        return "check_user";
    }
}
