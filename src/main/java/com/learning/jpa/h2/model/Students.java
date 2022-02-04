package com.learning.jpa.h2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="TBL_STUDENTS")
public class Students implements Serializable {
    @Id
    @Column(name = "id")
    private Integer studentId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private Integer flastName;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "country_id")
    private Countries countries;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getFlastName() {
        return flastName;
    }

    public void setFlastName(Integer flastName) {
        this.flastName = flastName;
    }

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }
}
