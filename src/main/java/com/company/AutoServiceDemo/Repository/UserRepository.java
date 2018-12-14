package com.company.AutoServiceDemo.Repository;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> getAllByRoleType(RoleType roleType);

    User getUserByFirstNameAndLastName(String firstName, String lastName);

    User findUserByAfm(String afm);

    User findUserByEmail(String email);

    User getUserById(Long id);


}
