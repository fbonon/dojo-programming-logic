package br.com.cit.dojo.ex1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class InsuranceServiceTest {

    @Before
    public void setup() {
    }

    @Test
    public void shouldCalculateCorrectValuesForInvoices() {
        double value1 = InsuranceService.calculateInvoiceValue(17, false, true);
        double value2 = InsuranceService.calculateInvoiceValue(49, false, true);
        double value3 = InsuranceService.calculateInvoiceValue(50, false, true);
        double value4 = InsuranceService.calculateInvoiceValue(30, true, true);
        double value5 = InsuranceService.calculateInvoiceValue(31, true, true);
        double value6 = InsuranceService.calculateInvoiceValue(50, true, true);
        double value7 = InsuranceService.calculateInvoiceValue(17, false, false);
        double value8 = InsuranceService.calculateInvoiceValue(49, false, false);
        double value9 = InsuranceService.calculateInvoiceValue(50, false, false);
        double value10 = InsuranceService.calculateInvoiceValue(30, true, false);
        double value11 = InsuranceService.calculateInvoiceValue(31, true, false);
        double value12 = InsuranceService.calculateInvoiceValue(50, true, false);

        assertEquals(350, value1, 0.001);
        assertEquals(500, value2, 0.001);
        assertEquals(900, value3, 0.001);
        assertEquals(600, value4, 0.001);
        assertEquals(500, value5, 0.001);
        assertEquals(900, value6, 0.001);
        assertEquals(550, value7, 0.001);
        assertEquals(700, value8, 0.001);
        assertEquals(990, value9, 0.001);
        assertEquals(800, value10, 0.001);
        assertEquals(700, value11, 0.001);
        assertEquals(990, value12, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotCalculateInvoicesIfDriverIsYoung() {
        InsuranceService.calculateInvoiceValue(17, true, true);
    }
}
