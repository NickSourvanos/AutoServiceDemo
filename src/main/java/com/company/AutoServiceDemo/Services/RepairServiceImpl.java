package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.Repair;
import com.company.AutoServiceDemo.Domain.Vehicle;
import com.company.AutoServiceDemo.Repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class RepairServiceImpl implements RepairService {

    @Autowired
    RepairRepository repairRepository;

    @Transactional
    public Repair saveRepair(Repair repair) {
        return repairRepository.save(repair);
    }
}
