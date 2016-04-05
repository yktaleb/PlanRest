package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "activity_history")
public class ActivityHistory {

    public ActivityHistory() {

    }

    public ActivityHistory(int id, int institutionId, int profileId) {
        this.id = id;
        this.institutionId = institutionId;
        this.profileId = profileId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "Institution_id", nullable = false)
    private int institutionId;

    @Column(name = "Profile_id", nullable = false)
    private int profileId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }
}
