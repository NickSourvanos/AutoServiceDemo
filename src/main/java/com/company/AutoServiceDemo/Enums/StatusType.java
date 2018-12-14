package com.company.AutoServiceDemo.Enums;

public enum StatusType {

    PENDING("pending"),
    IN_PROGRESS("in_progress"),
    COMPLETED("completed");

    private String status;

    StatusType(String role){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

}
