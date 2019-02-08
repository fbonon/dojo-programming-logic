package br.com.cit.dojo.ex5.service;

import br.com.cit.dojo.ex5.model.Customer;
import br.com.cit.dojo.ex5.model.OrderHistory;

public class SecurityService {

    public static boolean verifyCustomerCredibility(Customer customer) {
        if (customer == null) {
            return false;
        }

        double totalOrderCount = 0;
        double totalOrdersNotPaid = 0;
        double totalOrdersDelayed = 0;

        for (OrderHistory orderHistory : customer.getOrderHistoryList()) {
            totalOrderCount++;

            if (!orderHistory.isPaymentDone())
                totalOrdersNotPaid++;

            if (!orderHistory.isPaymentOnTime())
                totalOrdersDelayed++;
        }

        return (totalOrdersNotPaid / totalOrderCount <= 0.3) &&
                (totalOrdersDelayed / totalOrderCount <= 0.6) &&
                ((customer.getBalance() > 0) || (customer.getBalance() == 0 && totalOrdersDelayed == 0));
    }
}
