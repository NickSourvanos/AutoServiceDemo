package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> getAllByUser(User user) {
        return vehicleRepository.getAllByUser(user);
    }

    @Override
    public Vehicle findVehicleByPlateNUmber(String plateNumber) {
        return vehicleRepository.findVehicleByPlateNUmber(plateNumber);
    }

    @Override
    public List<Vehicle> getVehiclesByUser(User user){
        return getVehiclesByUser(user);
    }

    @Transactional
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }




}
