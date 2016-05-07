package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "photos_institution", schema = "PlanRest")
public class Affiche extends Model{

    public Affiche() {
        super();
    }

    public Affiche(Long id) {
        super(id);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
