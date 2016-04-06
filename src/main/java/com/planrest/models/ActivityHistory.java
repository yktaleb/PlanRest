package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "activity_history")
public class ActivityHistory extends Model{

    public ActivityHistory() {
        super();
    }

    public ActivityHistory(Long id) {
        super(id);
    }

    public ActivityHistory(int institutionId, int profileId) {
        this.institutionId = institutionId;
        this.profileId = profileId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Institution_id", nullable = false)
    private int institutionId;

    @Column(name = "Profile_id", nullable = false)
    private int profileId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
