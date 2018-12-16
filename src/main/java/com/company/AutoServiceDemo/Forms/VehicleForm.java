package com.company.AutoServiceDemo.Forms;

import javax.validation.constraints.Pattern;

public class VehicleForm {

    private static final String PLATE_NUMBER_PATTERN = "^[A-Z]{3}-[0-9]{4}$";

    private static final String YOM_PATTERN = "^[0-9]{4}$";

    private Long vehicleId;

    private Long user;

    private String model;

    @Pattern(regexp = YOM_PATTERN, message = "Invalid pattern")
    private String yearOfManufacture;

    private String color;

    @Pattern(regexp = PLATE_NUMBER_PATTERN, message = "Invalid pattern")
    private String plateNUmber;



    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlateNUmber() {
        return plateNUmber;
    }

    public void setPlateNUmber(String plateNUmber) {
        this.plateNUmber = plateNUmber;
    }
}
