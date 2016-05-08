package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "type_list", schema = "PlanRest")
public class TypeList extends Model{

    public TypeList() {
        super();
    }

    public TypeList(Long id) {
        super(id);
    }

    public TypeList(String title) {
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
