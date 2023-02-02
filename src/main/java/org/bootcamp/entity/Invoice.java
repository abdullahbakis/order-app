package org.bootcamp.entity;

/**
    Represents an invoice for a customer and an order.
    Contains information about the customer, order and total amount.
*/
public class Invoice {
    private Customer customer;
    private Order order;
    private double totalAmount;

    public Invoice(Customer customer, Order order) {
        this.customer = customer;
        this.order = order;
        this.totalAmount = order.getQuantity() * order.getPrice();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order getOrder() {
        return order;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customer=" + customer +
                ", order=" + order +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
