package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;

import java.awt.print.Pageable;
import java.util.List;


public interface RepairService {

    Repair saveRepair(Repair repair);

    List<Repair> getRepairsByVehicle(Vehicle vehicle);

    List<Repair> getRepairsByUser(User user);

    List<Repair> findFirst10ByOrderByRepairDateAsc();

    Repair findRepairByRepairId(Long repairId);

    void deleteByRepairId(Long repairId);


}
