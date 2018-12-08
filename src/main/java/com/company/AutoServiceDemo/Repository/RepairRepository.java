package com.company.AutoServiceDemo.Repository;


import com.company.AutoServiceDemo.Domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairRepository extends JpaRepository<Repair, Long> {
}
