package com.company.AutoServiceDemo.Repository;


import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Long> {

    List<Repair> getRepairsByVehicle(Vehicle vehicle);

    List<Repair> findRepairsByRepairDateBetween(String startDate, String endDate);



    List<Repair> findFirst10ByOrderByRepairDateDesc();

    Repair save(Repair repair);

    Repair findRepairByRepairId(Long repairId);

    void deleteByRepairId(Long repairId);

    List<Repair> getRepairsByVehicle_PlateNUmber(String plateNumber);

    List<Repair> getRepairsByVehicle_User_Afm (String afm);
}
