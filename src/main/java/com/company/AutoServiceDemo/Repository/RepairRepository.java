package com.company.AutoServiceDemo.Repository;


import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Long> {

    List<Repair> getRepairsByVehicle(Vehicle vehicle);

    List<Repair> findByRepairDateBetween(String startDate, String endDate);

    List<Repair> findFirst10ByOrderByRepairDateAsc();

   // List<Repair> getRepairsByUser(User user);
}
