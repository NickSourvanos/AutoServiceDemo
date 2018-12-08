package com.company.AutoServiceDemo.Domain;

public enum RepairType {
    MINOR_REPAIR("minor"),
    MAJOR_REPAIR("major");

    private String repairType;

    RepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getRepairType() {
        return repairType;
    }
}
