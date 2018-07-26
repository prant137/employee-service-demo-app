package com.demo.employee.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {

    @NotNull(message = "Id is a required field")
    @Id
    private String id;
    @NotNull(message = "Name is a required field")
    private String name;
    @NotNull(message = "Role is a required field")
    private String role;
    @NotNull(message = "Team is a required field")
    private String team;
    @NotNull(message = "Company is a required field")
    private String company;

    public Employee() {
        super();
    }
    public Employee(String id, String name, String role, String team, String company) {
        super();
        this.id = id;
        this.name = name;
        this.role = role;
        this.team = team;
        this.company = company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}
