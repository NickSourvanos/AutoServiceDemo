package com.company.AutoServiceDemo.Domain;

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

    @Column(name = "role_type")
    private String roleType;

    @OneToMany(mappedBy = "user", targetEntity = Repair.class)
    private List<Repair> repairs;

    public User() {}

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

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
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
                ", repairs=" + repairs +
                '}';
    }
}
