package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.Vehicle;

import java.util.List;


public interface RepairService {

    Repair saveRepair(Repair repair);

    List<Repair> getRepairsByVehicle(Vehicle vehicle);


}
