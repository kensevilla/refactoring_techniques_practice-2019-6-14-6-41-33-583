package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Test;

public class PriceCalculatorTest {

    @Test
    public void should_return_price_with_discount(){
        PriceCalculator priceCalculator = new PriceCalculator(1000,50);

        Assert.assertTrue(priceCalculator.getPrice() < 50000);
    }


}