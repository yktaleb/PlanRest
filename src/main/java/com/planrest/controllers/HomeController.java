package com.planrest.controllers;

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
        System.out.println("HEijeovdmwrvsfsvfd");
        return "forgot_password";
    }


    @RequestMapping(value = "/change_password", method = RequestMethod.POST)
    public String changePassword(HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        return "change_password";
    }
}
