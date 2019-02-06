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
                if (b == 0)
                    throw new IllegalArgumentException("Divisor não pode ser zero");
                else
                    return a / b;
            default:
                throw new UnsupportedOperationException("Operação não permitida");
        }
    }
}
