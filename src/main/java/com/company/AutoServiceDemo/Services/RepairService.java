package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;

import java.util.List;

public interface RepairService {

    Repair saveRepair(Repair repair);

    List<Repair> getRepairsByVehicle(Vehicle vehicle);

    List<Repair> getRepairsByUser(User user);

    List<Repair> findRepairsByRepairDateBetween(String startDate, String endDate);

    List<Repair> findFirst10ByOrderByRepairDateDesc();

    Repair findRepairByRepairId(Long repairId);

    void delete(Repair repair);

    List<Repair> getRepairsByVehicle_PlateNUmber(String plateNumber);

    List<Repair> getRepairsByVehicle_User_Afm(String afm);



}
