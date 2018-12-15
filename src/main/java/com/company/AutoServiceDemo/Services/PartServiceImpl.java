package com.company.AutoServiceDemo.Services;

import com.company.AutoServiceDemo.Domain.Part;
import com.company.AutoServiceDemo.Repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartServiceImpl implements PartService {

    @Autowired
    PartRepository partRepository;


    @Override
    public Part findByType(String partType) {
        return partRepository.findByType(partType);
    }

    @Override
    public List<Part> getAllParts(){return partRepository.findAll();}

}
