package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "photos_profile", schema = "PlanRest")
public class PhotosProfile extends Model{

    public PhotosProfile() {
        super();
    }

    public PhotosProfile(Long id) {
        super(id);
    }


    public PhotosProfile(byte[] photo) {
        this.photo = photo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

}
