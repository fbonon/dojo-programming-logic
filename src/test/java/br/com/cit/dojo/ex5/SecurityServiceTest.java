package br.com.cit.dojo.ex5;

import br.com.cit.dojo.ex5.model.Customer;
import br.com.cit.dojo.ex5.service.SecurityService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SecurityServiceTest {

    @Before
    public void setup() {
    }

    @Test
    public void shouldReturnTrueWhenClientHasBalanceAndPaymentOk() {
        Customer c = new Customer("John", 500);
        c.addHistory(true, true);
        c.addHistory(true, true);
        c.addHistory(true, true);
        c.addHistory(true, true);

        boolean result = SecurityService.verifyCustomerCredibility(c);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenBalanceIsNegativeAndPaymentOk() {
        Customer c = new Customer("Albert", -300);
        c.addHistory(true, true);
        c.addHistory(true, true);
        c.addHistory(true, true);
        c.addHistory(true, true);

        boolean result = SecurityService.verifyCustomerCredibility(c);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenBalanceIsNegativeAndPaymentNotOk() {
        Customer c = new Customer("Lily", -300);
        c.addHistory(false, false);
        c.addHistory(false, false);
        c.addHistory(false, false);
        c.addHistory(false, false);

        boolean result = SecurityService.verifyCustomerCredibility(c);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenBalanceIsZeroAndPaymentOK() {
        Customer c = new Customer("David", 0);
        c.addHistory(true, true);
        c.addHistory(true, true);
        c.addHistory(true, true);
        c.addHistory(true, true);

        boolean result = SecurityService.verifyCustomerCredibility(c);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenBalanceIsZeroAndPaymentNotOk() {
        Customer c = new Customer("Philip", 0);
        c.addHistory(false, true);
        c.addHistory(true, true);
        c.addHistory(true, true);
        c.addHistory(true, true);

        boolean result = SecurityService.verifyCustomerCredibility(c);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenBalanceIsZeroAndPaymentDelayed() {
        Customer c = new Customer("David", 0);
        c.addHistory(true, true);
        c.addHistory(true, true);
        c.addHistory(true, true);
        c.addHistory(true, false);

        boolean result = SecurityService.verifyCustomerCredibility(c);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenClientHasBalanceAndSomePaymentsOk() {
        Customer c = new Customer("Leonard", 500);
        c.addHistory(false, false);
        c.addHistory(true, false);
        c.addHistory(true, true);
        c.addHistory(true, true);

        boolean result = SecurityService.verifyCustomerCredibility(c);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenClientHasBalanceAnd30PercentPayment() {
        Customer c = new Customer("Billy", 500);
        c.addHistory(false, true);
        c.addHistory(false, true);
        c.addHistory(true, true);
        c.addHistory(true, true);

        boolean result = SecurityService.verifyCustomerCredibility(c);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenClientHasBalanceAnd60PercentDelayed() {
        Customer c = new Customer("Paul", 500);
        c.addHistory(true, false);
        c.addHistory(true, false);
        c.addHistory(true, false);
        c.addHistory(true, true);

        boolean result = SecurityService.verifyCustomerCredibility(c);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenClientIsNull() {
        boolean result = SecurityService.verifyCustomerCredibility(null);
        assertFalse(result);
    }
}
