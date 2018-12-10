package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> getAllBy();

    List<Vehicle> getAllByUser(User user);

    Vehicle findVehicleByPlateNUmber(String plateNumber);

    Vehicle saveVehicle(Vehicle vehicle);
}
