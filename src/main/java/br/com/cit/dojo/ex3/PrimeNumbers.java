package br.com.cit.dojo.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class PrimeNumbers {

    public static List<Integer> getPrimes() {

        int result = 0;
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= i - 1; j++) {

                result = (i % j);
                if (result == 0) {

                    isPrime = false;
                }
            }
            if (isPrime) {
                primes.add(i);
            }

        }
        return primes;
    }

    public static List<Integer> getPrimesWithSuffix(char suffix) {
        if (!Character.isDigit(suffix)){
            throw new IllegalArgumentException("Favor informar um Dado válido");
        }
        List<Integer> primes = getPrimes();
        List<Integer> primesWithSuffix = new ArrayList<>();
        for (Integer prime : primes) {
            int result = (prime % 10);

            if (result == Character.getNumericValue(suffix)) {
                primesWithSuffix.add(prime);
            }
        }

        return primesWithSuffix;
    }

}