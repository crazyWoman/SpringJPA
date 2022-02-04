package com.learning.jpa.h2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_COUNTRIES")
public class Countries {

    @Id
    @Column(name = "id")
    private Integer countryId;

    @Column(name = "country_name")
    private Integer countryName;


    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCountryName() {
        return countryName;
    }

    public void setCountryName(Integer countryName) {
        this.countryName = countryName;
    }
}
