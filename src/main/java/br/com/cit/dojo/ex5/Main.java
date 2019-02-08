package br.com.cit.dojo.ex5;

import br.com.cit.dojo.ex5.model.Customer;
import br.com.cit.dojo.ex5.service.SecurityService;

public class Main {

    public static void main(String[] args) {
        Customer c1 = new Customer("John", 500);
        c1.addHistory(true, true);
        c1.addHistory(true, true);
        c1.addHistory(true, true);
        c1.addHistory(true, true);

        boolean result = SecurityService.verifyCustomerCredibility(c1);

        System.out.println(result);
    }
}
