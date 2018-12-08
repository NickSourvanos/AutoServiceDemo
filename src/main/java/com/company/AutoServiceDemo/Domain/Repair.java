package com.company.AutoServiceDemo.Domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SERVICE")
public class Repair {

    private static final int MAX_LENGTH = 40;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long serviceId;

    @Column(name = "repair_date")
    private Date repairDate;

    @Column(name = "status")
    private Boolean status;

    @Enumerated(EnumType.STRING)
    @Column(name = "repair_type")
    private RepairType repairType;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "description")
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User userId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicle_id")
    private User vehicleId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "part_id")
    private User partId;

    public Repair(){}

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

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public User getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(User vehicleId) {
        this.vehicleId = vehicleId;
    }

    public User getPartId() {
        return partId;
    }

    public void setPartId(User partId) {
        this.partId = partId;
    }

    @Override
    public String toString() {
        return "Services{" +
                "serviceId=" + serviceId +
                ", repairDate=" + repairDate +
                ", status=" + status +
                ", repairType=" + repairType +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                ", vehicleId=" + vehicleId +
                ", partId=" + partId +
                '}';
    }
}
