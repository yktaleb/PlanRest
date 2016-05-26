package com.planrest.controllers;

import com.planrest.dao.impl.FriendDao;
import com.planrest.dao.impl.ProfileDao;
import com.planrest.models.Friend;
import com.planrest.models.Profile;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
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

}
