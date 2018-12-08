package com.company.AutoServiceDemo.Repository;

import com.company.AutoServiceDemo.Domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
