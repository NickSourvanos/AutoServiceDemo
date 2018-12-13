package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.User;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RepairServiceImpl implements RepairService {

    @Autowired
    public RepairRepository repairRepository;

    @Override
    public List<Repair> getRepairsByVehicle(Vehicle vehicle){
        return repairRepository.getRepairsByVehicle(vehicle);
    }

    @Transactional
    public Repair saveRepair(Repair repair) {
        return repairRepository.save(repair);
    }
}
