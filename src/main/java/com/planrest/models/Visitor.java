package com.planrest.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visitor", schema = "PlanRest")
public class Visitor extends Model{

    public Visitor() {
        super();
    }

    public Visitor(Long id) {
        super(id);
    }

    public Visitor(String date, String time, Long institutionId, Long profileId) {
        this.date = date;
        this.time = time;
        this.institutionId = institutionId;
        this.profileId = profileId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "time", nullable = false)
    private String time;

    @Column(name = "institution_id", nullable = false)
    private Long institutionId;

    @Column(name = "profile_id", nullable = false)
    private Long profileId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Long institutionId) {
        this.institutionId = institutionId;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }
}
