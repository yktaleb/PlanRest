package com.planrest.controllers;


import com.planrest.dao.impl.InstitutionDao;
import com.planrest.models.Institution;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class AdminController {

    @RequestMapping(value = "/admin_new_place", method = RequestMethod.GET)
    public ModelAndView adminNewPlace() {

        return new ModelAndView("admin_pages/admin_new_place", "institution", new Institution()) ;
    }


    @RequestMapping(value="/admin_new_place_check")
    public String adminNewPlaceCheck( @ModelAttribute Institution institution) {

        InstitutionDao institutionDao = new InstitutionDao();
//        Institution place = new Institution(institution.getAvatar(), institution.getName(), institution.getPhoneNumber(),
//                institution.getAddress(), institution.getLinkInstitution(), institution.getWorkingHours(),
//                institution.getKitchen(), institution.getServices(), institution.getAboutInstitution());
//        institutionDao.add(place);

//        byte[] bytes = null;
//
//        if (!file.isEmpty()) {
//            try {
//                bytes = file.getBytes();
////                BufferedOutputStream stream =
////                        new BufferedOutputStream(new FileOutputStream(new File("")));
////                stream.write(bytes);
////                stream.close();
//            } catch (Exception e) {
//                e.getMessage();
//            }
//        }

//        institution.setAvatar(bytes);
//
//        byte[] avatar = null;
//
//        try {
//            Part image = request.getPart("data");
//            if (image!=null){
//                avatar = IOUtils.toByteArray(image.getInputStream());
//                institution.setAvatar(avatar);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ServletException e) {
//            e.printStackTrace();
//        }

        institutionDao.add(institution);

        return "admin_pages/admin_new_place_check";
    }


}
