package com.company.AutoServiceDemo.Repository;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findAllByUser(User user);

    Vehicle findVehicleByPlateNUmber(String plateNumber);

    List<Vehicle> getVehiclesByUser(User user);

    Vehicle getVehicleByVehicleId(Long vehicleId);
}
