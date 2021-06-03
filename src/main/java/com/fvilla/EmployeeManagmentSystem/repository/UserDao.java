package com.fvilla.EmployeeManagmentSystem.repository;


import com.fvilla.EmployeeManagmentSystem.entity.User;

public interface UserDao {

    public User findByUserName(String userName);

    public void save(User user);

}

