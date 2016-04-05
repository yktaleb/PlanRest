package com.planrest.models;


import javax.persistence.*;

@Entity
@Table(name = "institution", schema = "PlanRest")
public class Institution {

    public Institution() {

    }

    public Institution(int id, byte[] avatar, String name, String phoneNumber, String address, String linkInstitution, String workingHours, String kitchen, String services, String averageScore, String aboutInstitution) {
        this.id = id;
        this.avatar = avatar;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.linkInstitution = linkInstitution;
        this.workingHours = workingHours;
        this.kitchen = kitchen;
        this.services = services;
        this.averageScore = averageScore;
        this.aboutInstitution = aboutInstitution;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "avatar")
    private byte[] avatar;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "link_institution")
    private String linkInstitution;

    @Column(name = "working_hours")
    private String workingHours;

    @Column(name = "kitchen")
    private String kitchen;

    @Column(name = "services")
    private String services;

    @Column(name = "average_score")
    private String averageScore;

    @Column(name = "about_institution")
    private String aboutInstitution;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(String averageScore) {
        this.averageScore = averageScore;
    }

    public String getAboutInstitution() {
        return aboutInstitution;
    }

    public void setAboutInstitution(String aboutInstitution) {
        this.aboutInstitution = aboutInstitution;
    }
}
