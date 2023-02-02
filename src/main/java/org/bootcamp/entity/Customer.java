package org.bootcamp.entity;

import java.time.LocalDate;

/**
 * Class to represent a Customer entity
 */
public class Customer {
    private String name;
    private String address;
    private LocalDate dateOfRegistration;

    public Customer(String name, String address, LocalDate dateOfRegistration) {
        this.name = name;
        this.address = address;
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dateOfRegistration=" + dateOfRegistration +
                '}';
    }
}
