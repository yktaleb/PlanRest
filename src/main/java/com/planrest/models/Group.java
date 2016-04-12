package com.planrest.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "groups", schema = "PlanRest")
public class Group extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "group_name", nullable = false)
    private String groupName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupAuthority")
    private List<GroupAuthorities> groupAuthorities;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupMember")
    private List<GroupMembers> groupMemberses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<GroupAuthorities> getGroupAuthorities() {
        return groupAuthorities;
    }

    public void setGroupAuthorities(List<GroupAuthorities> groupAuthorities) {
        this.groupAuthorities = groupAuthorities;
    }

    public List<GroupMembers> getGroupMemberses() {
        return groupMemberses;
    }

    public void setGroupMemberses(List<GroupMembers> groupMemberses) {
        this.groupMemberses = groupMemberses;
    }
}
