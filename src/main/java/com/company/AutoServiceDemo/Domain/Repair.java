package com.company.AutoServiceDemo.Domain;

import com.company.AutoServiceDemo.Enums.RepairType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SERVICE")
public class Repair {

    private static final int MAX_LENGTH = 40;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id", nullable = false)
    private Long serviceId;

    @Column(name = "repair_date", length = MAX_LENGTH)
    private Date repairDate;

    @Column(name = "status", length = MAX_LENGTH)
    private Boolean status;

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

    @ManyToOne(optional = false)
    @JoinColumn(name = "part_id")
    private Part part;

    public Repair(){}

    public Repair(Date repairDate, Boolean status, RepairType repairType, Double cost, String description, Vehicle vehicle, Part part) {
        this.repairDate = repairDate;
        this.status = status;
        this.repairType = repairType;
        this.cost = cost;
        this.description = description;
        this.vehicle = vehicle;
        this.part = part;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
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

    @Override
    public String toString() {
        return "Repair{" +
                "serviceId=" + serviceId +
                ", repairDate=" + repairDate +
                ", status=" + status +
                ", repairType=" + repairType +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", vehicle=" + vehicle +
                ", part=" + part +
                '}';
    }
}
