package com.company.AutoServiceDemo.Repository;

import com.company.AutoServiceDemo.enums.RoleType;
import com.company.AutoServiceDemo.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> getAllByRoleType(String roleType);

    User getUserByFirstNameAndLastName(String firstName, String lastName);



}
