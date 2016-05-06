package com.planrest.controllers;


import com.planrest.dao.impl.InstitutionDao;
import com.planrest.models.Institution;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @RequestMapping(value = "/admin_new_place", method = RequestMethod.GET)
    public ModelAndView adminNewPlace() {

        return new ModelAndView("admin_pages/admin_new_place", "institution", new Institution()) ;
    }


    @RequestMapping(value="/admin_new_place_check")
    public String adminNewPlaceCheck(@ModelAttribute Institution institution) {

        InstitutionDao institutionDao = new InstitutionDao();
//        Institution place = new Institution(institution.getAvatar(), institution.getName(), institution.getPhoneNumber(),
//                institution.getAddress(), institution.getLinkInstitution(), institution.getWorkingHours(),
//                institution.getKitchen(), institution.getServices(), institution.getAboutInstitution());
//        institutionDao.add(place);
        institutionDao.add(institution);
        System.out.println(institution.getAddress());

        return "admin_pages/admin_new_place_check";
    }

}
