package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "region_list", schema = "PlanRest")
public class RegionList extends Model{

    public RegionList() {
        super();
    }

    public RegionList(Long id) {
        super(id);
    }

    public RegionList(String title) {
        this.title = title;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
