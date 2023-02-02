package org.bootcamp;

import org.bootcamp.entity.Customer;
import org.bootcamp.entity.Invoice;
import org.bootcamp.entity.Order;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        List<Order> orders = new ArrayList<>();
        List<Invoice> invoices = new ArrayList<>();

        // add customers, orders, and invoices to the lists
        customers.add(new Customer("Fatma Sarı", "Manisa", LocalDate.of(2020, 6, 1)));
        customers.add(new Customer("Ceylan Halis", "Ağrı", LocalDate.of(2021, 3, 15)));
        customers.add(new Customer("Fuat Pul", "Ankara", LocalDate.of(2022, 6, 1)));

        orders.add(new Order("Fatma Sarı", "Manisa", LocalDate.of(2020, 6, 1),
                "Air Fryer", 2, 1900, "Tefal", "Technology"));
        orders.add(new Order("Ceylan Halis", "Ağrı", LocalDate.of(2021, 3, 15),
                "Mobile Phone", 3, 1250, "Apple", "Technology"));
        orders.add(new Order("Fuat Pul", "Ankara", LocalDate.of(2022, 6, 1),
                "Dying Light 2", 1, 400, "Techland", "Video Game"));

        for (Order order : orders) {
            invoices.add(new Invoice(getCustomerByName(customers, order.getName()), order));
        }


        // code to list customers
        System.out.println("List of customers: ");
        customers.stream().map(Customer::getName).forEach(System.out::println);

        // code to create new customers
        customers.add(new Customer("Fatih Ceyhan", "Batman", LocalDate.of(2020, 4, 30)));
        orders.add(new Order("Fatih Ceyhan", "Batman", LocalDate.of(2020, 4, 30),
                "Monitor", 5, 2856, "Monster", "Technology"));
        System.out.println("\nList of customers after creating a new one: ");
        customers.stream().map(Customer::getName).forEach(System.out::println);

        // code to list customers with the letter 'C' in them
        System.out.println("\nList of customers with the letter 'C' in their names: ");
        customers.stream().filter(c -> c.getName().toLowerCase().contains("c"))
                .map(Customer::getName).forEach(System.out::println);

        // code to list the total amount of invoices for customers who signed up in June
        System.out.println("\nTotal amount of invoices for customers who signed up in June: " +
                invoices.stream().filter(i -> i.getCustomer().getDateOfRegistration().getMonth().equals(Month.JUNE))
                        .mapToDouble(Invoice::getTotalAmount).sum());

        // code to list all invoices in the system
        System.out.println("\nList of all invoices in the system: ");
        invoices.forEach(System.out::println);

        // code to list invoices over 1500TL in the system
        System.out.println("\nList of invoices over 1500TL in the system: ");
        invoices.stream().filter(i -> i.getTotalAmount() > 1500).forEach(System.out::println);

        // code to calculate the average of invoices over 1500TL in the system
        double avgInvoicesOver1500 = invoices.stream().filter(i -> i.getTotalAmount() > 1500)
                .mapToDouble(Invoice::getTotalAmount).average().orElse(0);
        System.out.println("\nThe average of invoices over 1500TL in the system: " + avgInvoicesOver1500);

        // code to list the names of customers with invoices under 500TL in the system
        System.out.println("\nList of names of customers with invoices under 500TL in the system: ");
        invoices.stream().filter(i -> i.getTotalAmount() < 500).map(Invoice::getCustomer)
                .map(Customer::getName).forEach(System.out::println);


        // code to list of the sectors of the companies in which the average invoices for the month of June are below 750TL
        System.out.println("\nList of the sectors of the companies in which the average invoices for the month of June are below 750: ");
        Set<String> sectors = orders.stream().filter(s -> s.getDateOfRegistration().getMonth().equals(Month.JUNE))
                .filter(s -> invoices.stream().filter(i -> i.getOrder().equals(s))
                        .mapToDouble(Invoice::getTotalAmount).average().orElse(0.0) < 750)
                .map(Order::getSector).collect(Collectors.toSet());
        sectors.forEach(System.out::println);
    }

    private static Customer getCustomerByName(List<Customer> customers, String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}
