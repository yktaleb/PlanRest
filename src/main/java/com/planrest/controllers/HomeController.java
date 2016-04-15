package com.planrest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String changePassword() {
        return "forgot_password";
    }

}
