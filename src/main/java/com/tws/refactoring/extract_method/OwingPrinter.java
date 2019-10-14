package com.tws.refactoring.extract_method;

import java.util.*;

public class OwingPrinter {
    void printCustomerTotalBalance(String name, List<Order> orders) {
        generateBanner( name , computeTotalBalance(orders));
    }

    private double computeTotalBalance(List<Order> orders) {
        return orders.stream().map(a -> a.getAmount())
                .reduce((a, b) -> a + b).get();
    }

    private void generateBanner( String name , double totalBalance) {
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
        System.out.println("name: " + name);
        System.out.println("amount: " + totalBalance);
    }
}

class Order {
        private final double amount;

    public Order(double amount) {
            this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
