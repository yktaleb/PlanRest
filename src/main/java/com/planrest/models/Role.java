package com.planrest.models;

public class Role extends Model{

    public Role() {
        super();
    }

    public Role(Long id) {
        super(id);
    }


    private Long id;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
