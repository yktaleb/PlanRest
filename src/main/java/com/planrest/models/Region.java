package com.planrest.models;

public class Region extends Model{

    public Region() {
        super();
    }

    public Region(Long id) {
        super(id);
    }

    public Region(String title, Institution institution) {
        this.title = title;
        this.institution = institution;
    }

    private Long id;

    private String title;

    private Institution institution;

    public Long getId() {
        return id;
    }

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
