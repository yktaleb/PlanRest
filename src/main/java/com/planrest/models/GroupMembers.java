package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "group_members", schema = "PlanRest")
public class GroupMembers extends Model {

    public GroupMembers() {
    }

    public GroupMembers(String username, Group groupMember) {
        this.username = username;
        this.groupMember = groupMember;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group groupMember;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Group getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(Group groupMember) {
        this.groupMember = groupMember;
    }

}
