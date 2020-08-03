package com.twu.refactoring;

import java.util.List;

public class Order {
    String customerName;
    String addr;
    List<LineItem> lineItem;

    public Order(String customerName, String addr, List<LineItem> lineItem) {
        this.customerName = customerName;
        this.addr = addr;
        this.lineItem = lineItem;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return addr;
    }

    public List<LineItem> getLineItems() {
        return lineItem;
    }
}
