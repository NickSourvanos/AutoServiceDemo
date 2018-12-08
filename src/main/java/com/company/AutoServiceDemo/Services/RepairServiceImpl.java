package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepairServiceImpl implements RepairService {

    @Autowired
    RepairRepository repairRepository;

}
