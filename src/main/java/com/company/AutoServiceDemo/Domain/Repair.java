package com.company.AutoServiceDemo.Domain;

import com.company.AutoServiceDemo.Enums.RepairType;
import com.company.AutoServiceDemo.Enums.StatusType;
import jdk.jshell.Snippet;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "REPAIR")
public class Repair {
    //TODO: Add status as string-enum
    //TODO: change insert sql files
    private static final int MAX_LENGTH = 40;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repair_id", nullable = false)
    private Long repairId;

    @Column(name = "repair_date", length = MAX_LENGTH)
    private String repairDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = MAX_LENGTH)
    private StatusType status;

    @Enumerated(EnumType.STRING)
    @Column(name = "repair_type")
    private RepairType repairType;

    @Column(name = "cost", length = MAX_LENGTH)
    private Double cost;

    @Column(name = "description", length = MAX_LENGTH)
    private String description;


    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;


    @ManyToOne
    @JoinColumn(name = "part_id")
    private Part part;

    public Repair(){}

    public Long getRepairId() {
        return repairId;
    }

    public void setRepairId(Long repairId) {
        this.repairId = repairId;
    }

    public String getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(String repairDate) {
        this.repairDate = repairDate;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public RepairType getRepairType() {
        return repairType;
    }

    public void setRepairType(RepairType repairType) {
        this.repairType = repairType;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

}
