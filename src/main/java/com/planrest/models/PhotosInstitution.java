package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "photos_institution", schema = "PlanRest")
public class PhotosInstitution {

    public PhotosInstitution() {

    }

    public PhotosInstitution(int institutionId, byte[] photo) {
        this.institutionId = institutionId;
        this.photo = photo;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "institution_id", nullable = false)
    private int institutionId;

    @Column(name = "photo", nullable = false)
    private byte[] photo;

    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

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

}
