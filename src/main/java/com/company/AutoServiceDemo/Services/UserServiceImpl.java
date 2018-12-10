package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Enums.RoleType;
import com.company.AutoServiceDemo.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User saveUser(User user){
        return userRepository.save(user);
    }


    public List<User> getAllByRoleType(RoleType roleType) {
        return userRepository.getAllByRoleType(roleType);
    }

    @Transactional
    public User getUserByFirstNameAndLastName(String firstName, String lastName) {
        return userRepository.getUserByFirstNameAndLastName(firstName, lastName);
    }

    @Transactional
    public User deleteUser(User user){
        return deleteUser(user);
    }

    @Override
    public User findUserByAfm(String afm) {
        return userRepository.findUserByAfm(afm);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }



}
