package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Repository.RepairRepository;
import com.company.AutoServiceDemo.Repository.UserRepository;
import com.company.AutoServiceDemo.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class RepairServiceImpl implements RepairService {

    @Autowired
    public RepairRepository repairRepository;

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public VehicleRepository vehicleRepository;

    @Override
    public List<Repair> getRepairsByVehicle(Vehicle vehicle){
        return repairRepository.getRepairsByVehicle(vehicle);
    }


    @Override
    public List<Repair> getRepairsByUser(User user) {

        List<Vehicle> vehicles = vehicleRepository.getVehiclesByUser(user);
        List<Repair> repairs = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
                repairs.addAll(repairRepository.getRepairsByVehicle(vehicle));
        }

        return repairs;
    }

    @Transactional
    public Repair saveRepair(Repair repair) {
        return repairRepository.save(repair);
    }
}
