package br.com.cit.dojo.ex3;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static List<Integer> getPrimes() {

        List<Integer> primes = new ArrayList<>();
        boolean isPrime = true;

        for (int i = 2; i < 100; i++) {
            isPrime = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime)
                primes.add(i);
        }

        return primes;
    }

    public static List<Integer> getPrimesWithSuffix(char suffix) {

        if(!Character.isDigit(suffix)){
            throw new IllegalArgumentException("Só é permitido digitos numericos");
        }


        List<Integer> filteredList = new ArrayList<>();

        for (Integer prime : getPrimes()) {
            if (prime % 10 == Character.getNumericValue(suffix)) {
                filteredList.add(prime);
            }
        }

        return filteredList;
    }
}
