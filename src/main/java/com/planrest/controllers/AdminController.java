package com.planrest.controllers;


import com.planrest.dao.impl.*;
import com.planrest.models.*;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class AdminController {

//    @RequestMapping(value = "upload", method = RequestMethod.GET)
//    public String upload() {
//        return "upload";
//    }
//
//
//
//    /**
//     * Upload single file using Spring Controller
//     */
//    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
//    public @ResponseBody
//    String uploadFileHandler(@RequestParam("name") String name,
//                             @RequestParam("file") MultipartFile file) {
//
//        if (!file.isEmpty()) {
//            try {
//                byte[] bytes = file.getBytes();
//
//                System.out.println(bytes);
//
//                // Creating the directory to store file
////                String rootPath = System.getProperty("catalina.home");
////                File dir = new File(rootPath + File.separator + "tmpFiles");
////                if (!dir.exists())
////                    dir.mkdirs();
//
//                // Create the file on server
////                File serverFile = new File(dir.getAbsolutePath()
////                        + File.separator + name);
////                BufferedOutputStream stream = new BufferedOutputStream(
////                        new FileOutputStream(serverFile));
////                stream.write(bytes);
////                stream.close();
//
//
//                return "You successfully uploaded file=" + name;
//            } catch (Exception e) {
//                return "You failed to upload " + name + " => " + e.getMessage();
//            }
//        } else {
//            return "You failed to upload " + name
//                    + " because the file was empty.";
//        }
//    }
//
//    /**
//     * Upload multiple file using Spring Controller
//     */
//    @RequestMapping(value = "/uploadMultipleFile", method = RequestMethod.POST)
//    public @ResponseBody
//    String uploadMultipleFileHandler(@RequestParam("name") String[] names,
//                                     @RequestParam("file") MultipartFile[] files) {
//
//        if (files.length != names.length)
//            return "Mandatory information missing";
//
//        String message = "";
//        for (int i = 0; i < files.length; i++) {
//            MultipartFile file = files[i];
//            String name = names[i];
//            try {
//                byte[] bytes = file.getBytes();
//
//                // Creating the directory to store file
//                String rootPath = System.getProperty("catalina.home");
//                File dir = new File(rootPath + File.separator + "tmpFiles");
//                if (!dir.exists())
//                    dir.mkdirs();
//
//                // Create the file on server
//                File serverFile = new File(dir.getAbsolutePath()
//                        + File.separator + name);
//                BufferedOutputStream stream = new BufferedOutputStream(
//                        new FileOutputStream(serverFile));
//                stream.write(bytes);
//                stream.close();
//
//
//                message = message + "You successfully uploaded file=" + name
//                        + "<br />";
//            } catch (Exception e) {
//                return "You failed to upload " + name + " => " + e.getMessage();
//            }
//        }
//        return message;
//    }


    @RequestMapping(value = "/admin_new_place", method = RequestMethod.GET)
    public ModelAndView adminNewPlace() {

        return new ModelAndView("admin_pages/admin_new_place", "institution", new Institution()) ;
    }


    @RequestMapping(value="/admin_new_place_check", method = RequestMethod.POST)
    public @ResponseBody
    String adminNewPlaceCheck(@RequestParam("avatar") MultipartFile avatar, @RequestParam("value") String[] values, @RequestParam("region") String region,
                              @RequestParam("type") String[] types, @RequestParam("kitchen") String[] kitchens, @RequestParam("service") String[] services,
                              @RequestParam("image") MultipartFile[] images, @RequestParam("affiche") MultipartFile[] affiches) {

        Institution institution = new Institution();
        InstitutionDao institutionDao = new InstitutionDao();
        TypeDao typeDao = new TypeDao();
        KitchenDao kitchenDao = new KitchenDao();
        ServiceDao serviceDao = new ServiceDao();
        PhotosInstitutionDao photosInstitutionDao = new PhotosInstitutionDao();
        AfficheDao afficheDao = new AfficheDao();

        byte[] bytes = null;
        if (!avatar.isEmpty()) {
            try {
                bytes = avatar.getBytes();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        institution.setAvatar(bytes);

        institution.setName(values[0]);
        institution.setRegion(region);
        institution.setPhoneNumber(values[1]);
        institution.setAddress(values[2]);
        institution.setWorkingHours(values[3]);
        institution.setLinkInstitution(values[4]);
        institution.setAboutInstitution(values[5]);

        institutionDao.add(institution);

        ArrayList<Type> typeList = new ArrayList<Type>();
        for (String type : types) {
            typeList.add(new Type(type, institution));
        }
        typeDao.addList(typeList);

        ArrayList<Kitchen> kitchenList = new ArrayList<Kitchen>();
        for (String kitchen : kitchens) {
            kitchenList.add(new Kitchen(kitchen, institution));
        }
        kitchenDao.addList(kitchenList);

        ArrayList<Service> serviceList = new ArrayList<Service>();
        for (String service : services) {
            serviceList.add(new Service(service, institution));
        }
        serviceDao.addList(serviceList);

        ArrayList<PhotosInstitution> photoInstitutionList = new ArrayList<PhotosInstitution>();
        for (int i = 0; i < images.length; i++) {
            MultipartFile file = images[i];
            try {
                byte[] imageBytes = file.getBytes();
                photoInstitutionList.add(new PhotosInstitution(imageBytes, institution));
            } catch (Exception e) {
                e.getMessage();
            }
        }
        photosInstitutionDao.addList(photoInstitutionList);


        ArrayList<Affiche> afficheList = new ArrayList<Affiche>();
        for (int i = 0; i < affiches.length; i++) {
            MultipartFile file = affiches[i];
            try {
                byte[] afficheBytes = file.getBytes();
                afficheList.add(new Affiche(afficheBytes, institution));
            } catch (Exception e) {
                e.getMessage();
            }
        }
        afficheDao.addList(afficheList);

        return "admin_pages/admin_new_place_check";
    }

//    @RequestMapping(value="/admin_new_place_check", method = RequestMethod.POST)
//    public @ResponseBody
//    String adminNewPlaceCheck(@RequestParam("avatar") MultipartFile avatar, @ModelAttribute Institution institution) {
//
//        byte[] bytes = null;
//
//        if (!avatar.isEmpty()) {
//            try {
//                bytes = avatar.getBytes();
//            } catch (Exception e) {
//                e.getMessage();
//            }
//        }
//
//        institution.setAvatar(bytes);
//
//        InstitutionDao institutionDao = new InstitutionDao();
////        Institution place = new Institution(institution.getAvatar(), institution.getName(), institution.getPhoneNumber(),
////                institution.getAddress(), institution.getLinkInstitution(), institution.getWorkingHours(),
////                institution.getKitchen(), institution.getServices(), institution.getAboutInstitution());
////        institutionDao.add(place);
//
////        byte[] bytes = null;
////
////        if (!file.isEmpty()) {
////            try {
////                bytes = file.getBytes();
//////                BufferedOutputStream stream =
//////                        new BufferedOutputStream(new FileOutputStream(new File("")));
//////                stream.write(bytes);
//////                stream.close();
////            } catch (Exception e) {
////                e.getMessage();
////            }
////        }
//
////        institution.setAvatar(bytes);
////
////        byte[] avatar = null;
////
////        try {
////            Part image = request.getPart("data");
////            if (image!=null){
////                avatar = IOUtils.toByteArray(image.getInputStream());
////                institution.setAvatar(avatar);
////            }
////        } catch (IOException e) {
////            e.printStackTrace();
////        } catch (ServletException e) {
////            e.printStackTrace();
////        }
//
//        institutionDao.add(institution);
//
//        return "admin_pages/admin_new_place_check";
//    }


}
