package com.company.AutoServiceDemo.Services;


import com.company.AutoServiceDemo.Domain.Part;

import java.util.List;

public interface PartService {

    Part findByType(String partType);

    List<Part> getAllParts();
}
