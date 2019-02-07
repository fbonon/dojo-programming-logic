package br.com.cit.dojo.ex1;

public class Main {

    public static void main(String[] args) {
        double value = InsuranceService.calculateInvoiceValue(35, true, true);

        System.out.println(value);
    }
}
