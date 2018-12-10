package com.company.AutoServiceDemo.Enums;

public enum RepairType {
    MINOR_REPAIR("minor"),
    MAJOR_REPAIR("major");

    private String repair;

    RepairType(String repair){
        this.repair = repair;
    }

    public String getRepair() {
        return repair;
    }
}
