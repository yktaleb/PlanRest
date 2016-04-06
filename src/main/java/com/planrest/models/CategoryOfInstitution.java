package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "category_of_institution", schema = "PlanRest")
public class CategoryOfInstitution extends Model{

    public CategoryOfInstitution() {
        super();
    }

    public CategoryOfInstitution(Long id) {
        super(id);
    }

    public CategoryOfInstitution(String name, int institutionId) {
        this.name = name;
        this.institutionId = institutionId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "institution_id", nullable = false)
    private int institutionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
