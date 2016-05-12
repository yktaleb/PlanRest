package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "photos_institution", schema = "PlanRest")
public class PhotosInstitution extends Model{

    public PhotosInstitution() {
        super();
    }

    public PhotosInstitution(Long id) {
        super(id);
    }

    public PhotosInstitution(byte[] photo, Institution institution) {
        this.photo = photo;
        this.institution = institution;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "photo", nullable = false)
    private byte[] photo;

    @ManyToOne
    @JoinColumn(name = "Institution_id", nullable = false)
    private Institution institution;

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

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }
}
