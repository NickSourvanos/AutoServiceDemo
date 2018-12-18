package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;

import java.util.List;

public interface RepairService {

    Repair saveRepair(Repair repair);

    List<Repair> getRepairsByVehicle(Vehicle vehicle);

    List<Repair> getRepairsByUser(User user);

    List<Repair> findByRepairDateBetween(String startDate, String endDate);

    List<Repair> findFirst10ByOrderByRepairDateAsc();

    Repair findRepairByRepairId(Long repairId);

    void delete(Repair repair);




}
