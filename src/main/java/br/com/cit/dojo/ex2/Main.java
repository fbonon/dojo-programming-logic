package br.com.cit.dojo.ex2;

public class Main {

    public static void main(String[] args) {
        double result1 = Calculator.calculate('+', 7.1, 4.1);
        double result2 = Calculator.calculate('-', 7.1, 4.1);
        double result3 = Calculator.calculate('*', 7.1, 4.1);
        double result4 = Calculator.calculate('/', 7.1, 4.1);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
