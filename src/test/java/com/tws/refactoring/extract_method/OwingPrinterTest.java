package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_return_banner_with_customer_total_balance_given_customer_and_orders() {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(10.0));
        orderList.add(new Order(20.0));
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printCustomerTotalBalance("Gray", orderList);

        StringBuilder result = new StringBuilder();
        result.append("*****************************\r\n");
        result.append("****** Customer totals ******\r\n");
        result.append("*****************************\r\n");
        result.append("name: Gray\r\n");
        result.append("amount: 30.0\r\n");
        assertEquals(result.toString(), outContent.toString());
    }
}