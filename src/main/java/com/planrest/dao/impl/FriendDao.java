package com.planrest.dao.impl;

import com.planrest.dao.HibernatedDao;
import com.planrest.models.Friend;

import java.util.List;

public class FriendDao extends HibernatedDao<Friend> {

    public List<Friend> getAllFriend() {
        return getAll(Friend.class);
    }
}

