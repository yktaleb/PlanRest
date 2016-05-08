package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "kitchen_list", schema = "PlanRest")
public class KitchenList extends Model{

    public KitchenList() {
        super();
    }

    public KitchenList(Long id) {
        super(id);
    }

    public KitchenList(String title) {
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
