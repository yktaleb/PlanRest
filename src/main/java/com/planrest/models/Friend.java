package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "friend", schema = "PlanRest")
public class Friend extends Model{

    public Friend() {
        super();
    }

    public Friend(Long id) {
        super(id);
    }

    public Friend(Profile friend) {
        this.friend = friend;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;

    @OneToOne
    @JoinColumn(name = "id_friend", nullable = false)
    private Profile friend;

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

    public Profile getFriend() {
        return friend;
    }

    public void setFriend(Profile friend) {
        this.friend = friend;
    }
}

