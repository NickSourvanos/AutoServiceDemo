package com.company.AutoServiceDemo.Repository;

import com.company.AutoServiceDemo.Domain.Part;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PartRepository extends JpaRepository<Part, Long> {

    Part findByType(String partType);
}
