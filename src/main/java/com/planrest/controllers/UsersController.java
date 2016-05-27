package com.planrest.controllers;

import com.planrest.dao.impl.*;
import com.planrest.models.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Enumeration;

@Controller
public class UsersController {

    @RequestMapping(value="/users")
    public String users() {
        return "users";
    }

    @RequestMapping(value="/user")
    public String user() {
        return "user";
    }

    @RequestMapping(value="/add_to_friends_in_users_page")
    public ModelAndView  addToFriendsInUsersPage(HttpServletRequest request) {
        ProfileDao profileDao = new ProfileDao();
        FriendDao friendDao = new FriendDao();
        Friend friend = new Friend();

        String idFriend = request.getParameter("id");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String nameSender = authentication.getName();

        Profile profile = profileDao.getProfileByUserName(nameSender);

        friend.setIdFriend(Long.valueOf(idFriend));
        friend.setStatus("1");
        friend.setProfile(profile);

        friendDao.add(friend);

        return new ModelAndView(new RedirectView("/users"));
    }

//    @RequestMapping(value="/become_a_party")
//    public @ResponseBody
//    ModelAndView becomeAParty(@RequestParam("institutionId") String institutionId, @RequestParam("participantId") String participantId,
//                        @RequestParam("date") Date date, @RequestParam("time") Date time) {
//        System.out.println(participantId);
//        System.out.println(date);
//        System.out.println(time);
//
//
//        return new ModelAndView(new RedirectView("institution?institution_id=" + institutionId));
//    }

    @RequestMapping(value="/become_a_party")
    public ModelAndView  becomeAParty(HttpServletRequest request) {
        String institutionId = request.getParameter("institutionId");
        String participantId = request.getParameter("participantId");
        String date = request.getParameter("date");
        String time = request.getParameter("time");

        VisitorDao visitorDao = new VisitorDao();
        Visitor visitor = new Visitor();


        return new ModelAndView(new RedirectView("institution?institution_id=" + institutionId));
    }

    @RequestMapping(value="/edit_profile_check")
    public String editProfileCheck(HttpServletRequest request) {
        ProfileDao profileDao = new ProfileDao();

        String myId = request.getParameter("myId");
        Profile profile = profileDao.getById(Long.valueOf(myId));

        profile.setName(request.getParameter("name"));
        profile.setSurName(request.getParameter("surName"));
        profile.setStatus(request.getParameter("status"));
        profile.setCity(request.getParameter("city"));


        if (request.getParameter("region") != null) {
            profile.setRegion(request.getParameter("region"));
        }

        if (request.getParameter("relationship") != null) {
            profile.setRelationshipStatus(request.getParameter("relationship"));
        }

        profile.setPhoneNumber(request.getParameter("phoneNumber"));
        profile.setLinkVk(request.getParameter("linkVk"));
        profile.setAboutMyself(request.getParameter("text_about"));


        profileDao.update(profile);

        return "edit_profile";
    }

    @RequestMapping(value="/edit_profile")
    public String editProfile() {
        return "edit_profile";
    }

}
