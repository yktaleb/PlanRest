package com.planrest.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "institution", schema = "PlanRest")
public class Institution extends Model{

    public Institution() {
        super();
    }

    public Institution(Long id) {
        super(id);
    }

    public Institution(String name, String phoneNumber, String region, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.region = region;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "avatar")
    private byte[] avatar;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "link_institution")
    private String linkInstitution;

    @Column(name = "working_hours")
    private String workingHours;

    @Column(name = "about_institution")
    private String aboutInstitution;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "institution")
    private List<Kitchen> kitchens;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "institution")
    private List<Service> services;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "institution")
    private List<Type> types;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "institution")
    private List<PhotosInstitution> photosInstitutions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "institution")
    private List<Affiche> afficheList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkInstitution() {
        return linkInstitution;
    }

    public void setLinkInstitution(String linkInstitution) {
        this.linkInstitution = linkInstitution;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getAboutInstitution() {
        return aboutInstitution;
    }

    public void setAboutInstitution(String aboutInstitution) {
        this.aboutInstitution = aboutInstitution;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Kitchen> getKitchens() {
        return kitchens;
    }

    public void setKitchens(List<Kitchen> kitchens) {
        this.kitchens = kitchens;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }
}
