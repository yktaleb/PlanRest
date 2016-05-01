package com.planrest.controllers;

import com.planrest.dao.impl.ProfileDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String login() {

        return "login";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/forgot_password", method = RequestMethod.GET)
    public String forgotPassword() {
        ProfileDao.setIsThere(true);
        return "forgot_password";
    }


    @RequestMapping(value = "/change_password", method = RequestMethod.POST)
    public String changePassword(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ProfileDao profileDao = new ProfileDao();
        if (!profileDao.isThere(username)) {
            return "forgot_password";
        }

        profileDao.changePassword(password, username);


        return "change_password";
    }
}
