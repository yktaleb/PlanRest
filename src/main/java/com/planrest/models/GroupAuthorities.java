package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "group_authorities", schema = "PlanRest")
public class GroupAuthorities extends Model {

    @Id
    @Column(name = "authority", nullable = false)
    private String authority;

    @ManyToOne
    @JoinColumn(name = "group_id" )
    private Group groupAuthority;

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Group getGroup() {
        return groupAuthority;
    }

    public void setGroup(Group group) {
        this.groupAuthority = group;
    }

    public Group getGroupAuthority() {
        return groupAuthority;
    }

    public void setGroupAuthority(Group groupAuthority) {
        this.groupAuthority = groupAuthority;
    }
}
