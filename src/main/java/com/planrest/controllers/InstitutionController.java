package com.planrest.controllers;

import com.planrest.models.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class InstitutionController {

    @RequestMapping(value="/institution")
    public String institution(HttpServletRequest request) {
        String id = request.getParameter("id");
        return "institution";
    }

    @RequestMapping(value="/places")
    public String places(HttpServletRequest request) {
        String id = request.getParameter("id");
        return "places";
    }

}
