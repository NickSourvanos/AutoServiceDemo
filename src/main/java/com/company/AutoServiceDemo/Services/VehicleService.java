package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAllByUser(User user);

    Vehicle findVehicleByPlateNUmber(String plateNumber);

    Vehicle saveVehicle(Vehicle vehicle);

    List<Vehicle> getVehiclesByUser(User user);




}
