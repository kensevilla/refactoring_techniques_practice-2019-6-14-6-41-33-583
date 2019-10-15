package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private int quantity;
    private int itemPrice;
    private double FIVE_PERCENT_DISCOUNT = 0.05;
    private int DISCOUNTED_QUANTITY = 500;
    private double TEN_PERCENT_SHIPPING = 0.1;
    private double MINIMUM_SHIPPING_COST = 100.0;

    public PriceCalculator(int quantity, int itemPrice){
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    double getPrice() {
        return quantity * itemPrice -
                getDiscount() +
                getShippingCost();
    }

    private double getDiscount(){
        int discountQuantity = quantity - DISCOUNTED_QUANTITY;
        return discountQuantity>0 ? (discountQuantity) * itemPrice * FIVE_PERCENT_DISCOUNT : 0;
    }

    private double getShippingCost(){
        double shippingCost = quantity * itemPrice * TEN_PERCENT_SHIPPING;
        return Math.min(shippingCost, MINIMUM_SHIPPING_COST);
    }
}
