package com.gs.service;

import com.gs.bean.User;
import com.gs.dao.UserDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by WangGenshen on 1/12/16.
 */
@Service
@Transactional
public class UserService {

    @Resource
    private UserDAO userDAO;

    public List<User> queryAll() {
        return userDAO.queryAll();
    }
}
