package com.curso.user.services.users;

import com.curso.user.models.users.User;

public interface UserService {

    User create(User user);
    User findUserById(String id);
    User updateUser(String id,User user);
    void activeUser(String hash);
    void resetPassword(String id,String password);
    void sendHashRestPassword(String email);

}
