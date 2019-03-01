package br.com.cit.dojo.ex5.service;

import br.com.cit.dojo.ex5.model.Customer;
import br.com.cit.dojo.ex5.model.OrderHistory;

import java.util.concurrent.CompletionStage;

public class SecurityService {

    public static boolean verifyCustomerCredibility(Customer customer) {

        int countNotPay = 0, countLatePay = 0;

        if(customer == null) {
            return false;
        }

        if (customer.getBalance() < 0) {
            return false;
        }

        for (OrderHistory history : customer.getOrderHistoryList()) {
            if (!history.isPaymentDone()) {
                countNotPay++;
            }
            if (!history.isPaymentOnTime()) {
                countLatePay++;
            }
        }

        if((double) countNotPay / (double) customer.getOrderHistoryList().size() > 0.3)
            return false;

        if (customer.getBalance() == 0 && countLatePay > 0) {
            return false;
        }

        if((double) countLatePay / (double) customer.getOrderHistoryList().size() > 0.6) {
            return false;
        }

        return true;
    }
}
