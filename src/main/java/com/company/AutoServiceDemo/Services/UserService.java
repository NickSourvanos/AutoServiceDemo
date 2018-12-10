package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Enums.RoleType;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllByRoleType(RoleType roleType);

    User getUserByFirstNameAndLastName(String firstName, String lastName);

    User saveUser(User user);

    void deleteUser(User user);

    User findUserByAfm(String afm);

    User findUserByEmail(String email);

    User getUserById(Long id);

}
