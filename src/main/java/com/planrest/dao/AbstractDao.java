package com.planrest.dao;

import com.planrest.models.Model;

import java.util.List;

public interface AbstractDao<T extends Model> {

    public List<T> getAll(Class cl);

    public T getById(Class cl, Long id);

    public void add (T model);

    public void update(T model);

    public void remove(Class cl, Long id);

    public void remove(T model);

}
