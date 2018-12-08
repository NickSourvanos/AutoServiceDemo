package com.company.AutoServiceDemo.Domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {

    private static final int MAX_LENGTH = 40;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private Long vehicleId;

    @Column(name = "plate_number")
    private String plateNUmber;

    @Column(name = "model")
    private String model;

    @Column(name = "year_of_manufacture")
    private Date yearOfManufacture;

    @Column(name = "color")
    private String color;

    public Vehicle(){}

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getPlateNUmber() {
        return plateNUmber;
    }

    public void setPlateNUmber(String plateNUmber) {
        this.plateNUmber = plateNUmber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(Date yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", plateNUmber='" + plateNUmber + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", color='" + color + '\'' +
                '}';
    }
}
