package com.company.AutoServiceDemo.Services;


import com.company.AutoServiceDemo.Domain.Part;

public interface PartService {

    Part findByType(String partType);
}
