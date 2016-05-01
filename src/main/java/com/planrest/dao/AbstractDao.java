package com.planrest.dao;

import com.planrest.models.Model;
import org.hibernate.mapping.Column;
import org.hibernate.mapping.Table;

import java.util.List;

public interface AbstractDao<T extends Model> {

    public List<T> getAll(Class cl);

    public T getById(Long id);

    public void add (T model);

    public void update(T model);

    public void remove(Class cl, Long id);

    public void remove(T model);

//    public void updateValue(Table table, Column column, String value, String where, String whereValue);

}
