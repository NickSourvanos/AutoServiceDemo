package com.company.AutoServiceDemo.Domain;

import com.company.AutoServiceDemo.Enums.RoleType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER", uniqueConstraints = {@UniqueConstraint(columnNames = {"afm"})})
public class User {

    private static final int MAX_LENGTH = 40;

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "afm", length = MAX_LENGTH)
    private String afm;

    @Column(name = "first_name", length = MAX_LENGTH)
    private String firstName;

    @Column(name = "last_name", length = MAX_LENGTH)
    private String lastName;

    @Column(name = "address", length = MAX_LENGTH)
    private String address;

    @Column(name = "email", length = MAX_LENGTH)
    private String email;

    @Column(name = "password", length = MAX_LENGTH)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_type")
    private RoleType roleType;

    @OneToMany(mappedBy = "user", targetEntity = Vehicle.class)
    private List<Vehicle> vehicles;

    public User() {}

    public User(String afm, String firstName, String lastName, String address, String email, String password, RoleType roleType, List<Vehicle> vehicles) {
        this.afm = afm;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.roleType = roleType;
        this.vehicles = vehicles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAfm() { return afm; }

    public void setAfm(String afm) { this.afm = afm; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", afm='" + afm + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roleType=" + roleType +
                ", vehicles=" + vehicles +
                '}';
    }
}
