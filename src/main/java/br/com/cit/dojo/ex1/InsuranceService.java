package br.com.cit.dojo.ex1;

public class InsuranceService {

    public static double calculateInvoiceValue(int age, boolean driver, boolean healthy) {
        double value = 0;

        if (age <= 17) {
            value = 350.00;

            if (driver)
                throw new IllegalArgumentException("Não é permitido um motorista menor de 18 anos.");
        }


        if (age >= 18 && age <= 49)
            value = 500.00;

        if (age >= 50)
            value = 900.00;

        if (age <= 30 && driver)
            value += 100;

        if (healthy == false)
            value += 200;

        if (healthy == false && age >= 50)
            value = value - (value * 0.1);

        return value;
    }
}
