package com.employee.employee_mgmt_with_db.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {
    @Id
    int id;
    String first_name;
    String last_name;
    String email_address;
    String phone;
    String street_address_1;
    String street_address_2;
    String city;
    String state;
    int zip_code;
    String Country;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail_address() {
        return email_address;
    }
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getStreet_address_1() {
        return street_address_1;
    }
    public void setStreet_address_1(String street_address_1) {
        this.street_address_1 = street_address_1;
    }
    public String getStreet_address_2() {
        return street_address_2;
    }
    public void setStreet_address_2(String street_address_2) {
        this.street_address_2 = street_address_2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZip_code() {
        return zip_code;
    }
    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }
    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {
        Country = country;
    }


}
