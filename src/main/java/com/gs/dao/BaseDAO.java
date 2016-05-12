package com.gs.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by WangGenshen on 1/12/16.
 */
public abstract class BaseDAO<T, ID extends Serializable> {

    public abstract void add(T t);

    public abstract List<T> queryAll();

    public abstract T query(ID id);
}
