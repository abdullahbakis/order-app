package org.bootcamp.entity;

import java.time.LocalDate;

/**

 This class represents an Order made by a Customer. It includes information about the product, quantity, price, company and sector.
 The class extends the Customer class, inheriting its properties and methods.
 It also overrides the toString() method for a custom representation of the Order object.
 */
public class Order extends Customer {
    private String product;
    private int quantity;
    private double price;
    private String company;
    private String sector;


    public Order(String name, String address, LocalDate dateOfRegistration, String product,
                 int quantity, double price, String company, String sector) {
        super(name, address, dateOfRegistration);
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.company = company;
        this.sector = sector;
    }

    // getters
    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public String getSector() {
        return sector;
    }


    // Override the toString method to return the string representation of the order

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }
}
