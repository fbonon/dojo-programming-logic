package br.com.cit.dojo.ex5.service;

import br.com.cit.dojo.ex5.model.Customer;
import br.com.cit.dojo.ex5.model.OrderHistory;

public class SecurityService {

    public static boolean verifyCustomerCredibility(Customer customer) {
        if (customer == null) {
            return false;
        }
        if (customer.getBalance() < 0) {
            return false;

        }
        if (customer.getBalance() == 0) {
            for (OrderHistory orderHistory : customer.getOrderHistoryList()) {
                if (orderHistory.isPaymentOnTime() == false) {

                    return false;
                }
            }
        }
        double totalOrders = customer.getOrderHistoryList().size();
        double notPaidOrders = 0;
        double paymentOnTime = 0;
        for (OrderHistory orderHistory : customer.getOrderHistoryList()) {
            if (orderHistory.isPaymentDone() == false) {
                notPaidOrders++;
            }
            if (orderHistory.isPaymentOnTime() == false) {
                paymentOnTime++;

            }

            if (notPaidOrders / totalOrders > 0.3) {
                return false;
            }

            if (paymentOnTime / totalOrders > 0.6) {
                return false;
            }
        }
        return true;
    }

}


