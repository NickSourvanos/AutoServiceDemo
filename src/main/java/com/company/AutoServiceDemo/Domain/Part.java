package com.company.AutoServiceDemo.Domain;

import javax.persistence.*;

@Entity
@Table(name = "PART")
public class Part {

    private static final int MAX_LENGTH = 40;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "part_id", nullable = false)
    private Long partId;

    @Column(name = "type", length = MAX_LENGTH)
    private String type;

    @Column(name = "cost", length = MAX_LENGTH)
    private Double cost;

    public Part(){}

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Part{" +
                "partId=" + partId +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                '}';
    }
}
