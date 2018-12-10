package com.company.AutoServiceDemo.Repository;


import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepairRepository extends JpaRepository<Repair, Long> {

    List<Repair> getAllByVehicle(Vehicle vehicle);

}
