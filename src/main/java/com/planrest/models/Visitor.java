package com.planrest.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visitor", schema = "PlanRest")
public class Visitor {

    public Visitor() {

    }

    public Visitor(int id, Date date, String time, int institutionId, int profileId) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.institutionId = institutionId;
        this.profileId = profileId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "time", nullable = false)
    private String time;

    @Column(name = "institution_id", nullable = false)
    private int institutionId;

    @Column(name = "profile_id", nullable = false)
    private int profileId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

}
