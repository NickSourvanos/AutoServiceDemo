package com.company.AutoServiceDemo.Enums;

public enum RoleType {
    ADMIN_ROLE("admin"),
    SIMPLE_USER_ROLE("simple_user");

    private String role;

    RoleType(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }



}
