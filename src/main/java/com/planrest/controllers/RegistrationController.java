package com.planrest.controllers;

import com.planrest.dao.impl.ProfileDao;
import com.planrest.dao.impl.UserDao;
import com.planrest.models.Profile;
import com.planrest.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
public class RegistrationController {

    @RequestMapping(value="/registration")
    public ModelAndView registration() {
        return new ModelAndView("registration", "profile", new Profile());
    }

    @RequestMapping(value="/check_user")
    public ModelAndView checkUser(@ModelAttribute Profile profile) {

        User user = new User(profile.getEmail(), profile.getPassword(), true);
        UserDao userDao = new UserDao();
        userDao.add(user);

        ProfileDao profileDao = new ProfileDao();
        profileDao.add(profile);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("check_user");
        modelAndView.addObject("prof", profile);

        return modelAndView;
    }
}
