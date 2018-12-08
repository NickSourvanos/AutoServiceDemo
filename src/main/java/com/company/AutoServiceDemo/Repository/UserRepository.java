package com.company.AutoServiceDemo.Repository;

import com.company.AutoServiceDemo.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


}
