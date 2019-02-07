package br.com.cit.dojo.ex3;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static List<Integer> getPrimes() {

        List<Integer> primes = new ArrayList<Integer>();
        int maxPrimeValue = 100;

        for (int number = 2; number <= maxPrimeValue; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= maxPrimeValue; divisor++) {
                if ((divisor != number) && (number % divisor == 0)) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                primes.add(number);
            }
        }

        return primes;
    }

    public static List<Integer> getPrimesWithSuffix(char suffix) {

        List<Integer> primesWithSuffix = new ArrayList<Integer>();

        if (Character.isDigit(suffix)) {
            int suffixNumber = Character.getNumericValue(suffix);

            for (Integer prime : getPrimes()) {
                if (prime % 10 == suffixNumber) {
                    primesWithSuffix.add(prime);
                }
            }
        } else {
            throw new IllegalArgumentException("Favor informar um número");
        }

        return primesWithSuffix;
    }
}
