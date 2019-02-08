package br.com.cit.dojo.ex5.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private double balance;
    private List<OrderHistory> orderHistoryList;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void addHistory(boolean paymentDone, boolean paymentOnTime) {
        if (orderHistoryList == null) {
            orderHistoryList = new ArrayList<OrderHistory>();
        }
        orderHistoryList.add(new OrderHistory(paymentDone, paymentOnTime));
    }

    public void resetHistory() {
        orderHistoryList = new ArrayList<OrderHistory>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<OrderHistory> getOrderHistoryList() {
        return orderHistoryList;
    }

    public void setOrderHistoryList(List<OrderHistory> orderHistoryList) {
        this.orderHistoryList = orderHistoryList;
    }
}
