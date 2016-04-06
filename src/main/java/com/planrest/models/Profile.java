package com.planrest.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "profile", schema = "PlanRest")
public class Profile extends Model{

    public Profile() {
        super();
    }

    public Profile(Long id) {
        super(id);
    }

    public Profile(String password, String email, String sex, String name, String surName) {
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.name = name;
        this.surName = surName;
    }

    public Profile(String password, String email, String sex, String name, String surName, byte[] avatar, String status, Date dateOfBirth, String phoneNumber, String stateOfResidence, String relationshipStatus, String placeOfStudy, String favoritePlace, String linkVk, String aboutMyself) {
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.name = name;
        this.surName = surName;
        this.avatar = avatar;
        this.status = status;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.stateOfResidence = stateOfResidence;
        this.relationshipStatus = relationshipStatus;
        this.placeOfStudy = placeOfStudy;
        this.favoritePlace = favoritePlace;
        this.linkVk = linkVk;
        this.aboutMyself = aboutMyself;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "sur_name", nullable = false)
    private String surName;

    @Column(name = "avatar")
    private byte[] avatar;

    @Column(name = "status")
    private String status;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "state_of_residence")
    private String stateOfResidence;

    @Column(name = "relationship_status")
    private String relationshipStatus;

    @Column(name = "place_of_study")
    private String placeOfStudy;

    @Column(name = "favorite_place")
    private String favoritePlace;

    @Column(name = "link_vk")
    private String linkVk;

    @Column(name = "about_myself")
    private String aboutMyself;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profile")
    private List<PhotosProfile> photosProfiles;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profile")
    private List<Friend> friends;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "friend")
    private Friend friend;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStateOfResidence() {
        return stateOfResidence;
    }

    public void setStateOfResidence(String stateOfResidence) {
        this.stateOfResidence = stateOfResidence;
    }

    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    public String getPlaceOfStudy() {
        return placeOfStudy;
    }

    public void setPlaceOfStudy(String placeOfStudy) {
        this.placeOfStudy = placeOfStudy;
    }

    public String getFavoritePlace() {
        return favoritePlace;
    }

    public void setFavoritePlace(String favoritePlace) {
        this.favoritePlace = favoritePlace;
    }

    public String getLinkVk() {
        return linkVk;
    }

    public void setLinkVk(String linkVk) {
        this.linkVk = linkVk;
    }

    public String getAboutMyself() {
        return aboutMyself;
    }

    public void setAboutMyself(String aboutMyself) {
        this.aboutMyself = aboutMyself;
    }

    public List<PhotosProfile> getPhotosProfiles() {
        return photosProfiles;
    }

    public void setPhotosProfiles(List<PhotosProfile> photosProfiles) {
        this.photosProfiles = photosProfiles;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }


}
