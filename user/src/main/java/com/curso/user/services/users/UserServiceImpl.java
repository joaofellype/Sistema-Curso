package com.curso.user.services.users;

import com.curso.user.models.users.User;
import com.curso.user.repository.users.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {


        return userRepository.save(user);
    }

    @Override
    public User findUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User updateUser(String id, User user) {
        user.setId(id);
        return  userRepository.save(user);
    }

    @Override
    public void activeUser(String hash) {

        var active = userRepository.findHash(hash);

        if(active == null)
            throw new RuntimeException("Error active");

        active.setActive(true);
        userRepository.save(active);
    }

    @Override
    public void resetPassword(String id, String password) {

        var user = findUserById(id);
        user.setPassword(password);
        userRepository.save(user);
    }

    @Override
    public void sendHashRestPassword(String email) {

    }
}
