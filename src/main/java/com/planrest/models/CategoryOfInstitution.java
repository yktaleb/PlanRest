package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "category_of_institution", schema = "PlanRest")
public class CategoryOfInstitution {

    public CategoryOfInstitution() {

    }

    public CategoryOfInstitution(int id, String name, int institutionId) {
        this.id = id;
        this.name = name;
        this.institutionId = institutionId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "institution_id", nullable = false)
    private int institutionId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }
}
