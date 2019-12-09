package net.centro.sample.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import net.centro.sample.models.User;
import net.centro.sample.repositories.UserRepository;
import net.centro.sample.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers(String name) {
        if (StringUtils.isEmpty(name)) {
            return userRepository.findAll();
        } else {
            return userRepository.findByName(name);
        }
    }

    @Override
    public User getUser(long id) {
        Optional<User> optUser = userRepository.findById(id);
        return optUser.isPresent() ? optUser.get() : null;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
