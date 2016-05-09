package com.planrest.models;

import javax.persistence.*;

@Entity
@Table(name = "service", schema = "PlanRest")
public class Service extends Model{

    public Service() {
        super();
    }

    public Service(Long id) {
        super(id);
    }

    public Service(String title, Institution institution) {
        this.title = title;
        this.institution = institution;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "Institution_id", nullable = false)
    private Institution institution;

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

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }
}
