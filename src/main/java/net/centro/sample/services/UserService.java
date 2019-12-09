package net.centro.sample.services;

import java.util.List;

import net.centro.sample.models.User;

public interface UserService {

    List<User> getUsers(String name);

    User getUser(long id);

    User createUser(User user);

}