package com.company.service.impl;

import com.company.YourException;
import com.company.dao.UserDao;
import com.company.service.UserService;
import com.company.model.User;

import java.util.List;
import java.util.Optional;


public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(User user, User user1, User user2, UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void findWithID(List<User> mas, int ID) {
        Optional<User> user = mas.stream().filter(x -> x.getId() == ID).findAny();
        try {
            if (user.isEmpty()) {
                throw new YourException("MYNDAI ID JOK!!!");
            } else {
                System.out.println(user.get());
            }
        } catch (YourException e) {
            System.err.println(e.getMessage());
        }


    }

    @Override
    public void deleteWithID(List<User> mas, int ID) {
        Optional<User> any2 = mas.stream().filter(x -> x.getId() == ID).findAny();
        mas.removeIf(x -> x.getId() == ID);

    }

    @Override
    public void getAllUsers(List<User> mas) {
        mas.stream().forEach(System.out::println);


    }

    @Override
    public void addUser(List<User> mas, User user) {
        mas.add(user);


    }
}

