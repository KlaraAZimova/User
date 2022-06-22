package com.company.service;

import com.company.model.User;
import java.util.List;

public interface UserService {

    void addUser(List<User> mas, User user);

    void findWithID(List<User> mas, int ID);

    void deleteWithID(List<User> mas, int ID);

    void getAllUsers(List<User> mas);
}
