package br.com.cit.dojo.ex1;

public class InsuranceService {

    public static double calculateInvoiceValue(int age, boolean driver, boolean healthy) {

        double value = 0;

        if (age < 18) {
            if (driver) {
                throw new IllegalArgumentException("Não é permitido um motorista ter menos de 18 anos");
            }

            value = 350;
        } else if (age <= 30 && driver) {
            value = 600;
        } else if (age < 50) {
            value = 500;
        } else {
            value = 900;
        }

        if (!healthy) {
            value += 200;

            if (age >= 50) {
                value *= 0.9;
            }
        }

        return value;
    }
}
