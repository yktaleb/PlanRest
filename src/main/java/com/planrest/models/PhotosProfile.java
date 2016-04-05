package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "photos_profile", schema = "PlanRest")
public class PhotosProfile {

    public PhotosProfile() {

    }

    public PhotosProfile(byte[] photo) {
        this.photo = photo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "photo", nullable = false)
    private byte[] photo;

    @ManyToOne
    @JoinColumn(name = "Profile_id", nullable = false)
    private Profile profile;

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

}
