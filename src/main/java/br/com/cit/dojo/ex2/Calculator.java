package br.com.cit.dojo.ex2;

public class Calculator {

    public static double calculate(char operation, double a, double b) {

        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Divisão não suportada");
                }
                return a / b;
            default:
                throw new UnsupportedOperationException("Operador não suportado");
        }
    }
}
