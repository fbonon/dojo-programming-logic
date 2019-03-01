package br.com.cit.dojo.ex1;

public class InsuranceService {

    public static double calculateInvoiceValue(int age, boolean driver, boolean healthy) {

        // Do stuff here...

        double value = 0;


        if (age <= 17 && driver) {
            throw new IllegalArgumentException("Não é permitido motorista abaixo de 18 anos");
        }

        if (age <= 17) {
            value = 350;
        }
        else if (age >= 30 && age <= 49) {
            value = 500;

        } else if (age >= 50) {
            value = 900;

        }

        if (age <= 30 && driver) {
            value += 100;
        }

        if (!healthy) {
            value += 200;

            if (age >= 50) {
                value *=  0.9;
            }
        }


        return value;

    }
}
