package com.company.AutoServiceDemo.Domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "VEHICLE", uniqueConstraints = @UniqueConstraint(columnNames = {"plate_number"}))
public class Vehicle {

    private static final int MAX_LENGTH = 40;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id", nullable = false)
    private Long vehicleId;

    @Column(name = "plate_number", length = MAX_LENGTH)
    private String plateNUmber;

    @Column(name = "model", length = MAX_LENGTH)
    private String model;

    @Column(name = "year_of_manufacture", length = 4)
    private String yearOfManufacture;

    @Column(name = "color", length = MAX_LENGTH)
    private String color;

    @OneToMany(mappedBy = "part", targetEntity = Repair.class)
    private List<Repair> repairs;

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

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", plateNUmber='" + plateNUmber + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", color='" + color + '\'' +
                ", repairs=" + repairs +
                '}';
    }
}
