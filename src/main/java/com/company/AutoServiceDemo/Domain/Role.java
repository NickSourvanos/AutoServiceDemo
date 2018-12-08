package com.company.AutoServiceDemo.Domain;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
public class Role {

    private static final int MAX_LENGTH = 40;

    @Id
    @Column(name = "role_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    @Column(name = "description", length = MAX_LENGTH)
    private String dscription;

    public Role(){}

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getDscription() {
        return dscription;
    }

    public void setDscription(String dscription) {
        this.dscription = dscription;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", dscription='" + dscription + '\'' +
                '}';
    }
}
