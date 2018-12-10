package com.company.AutoServiceDemo.Repository;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> getAllBy();

    List<Vehicle> getAllByUser(User user);

    Vehicle findVehicleByPlateNUmber(String plateNumber);



}
