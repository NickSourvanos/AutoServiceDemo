package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.enums.RoleType;
import com.company.AutoServiceDemo.Domain.User;

import java.util.List;

public interface UserService {

    List<User> getAllByRoleType(String roleType);

    User getUserByFirstNameAndLastName(String firstName, String lastName);

    User saveUser(User user);

    User deleteUser(User user);



}
