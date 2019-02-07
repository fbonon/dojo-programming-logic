package br.com.cit.dojo.ex3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> primes = PrimeNumbers.getPrimes();
        List<Integer> suffixPrimes = PrimeNumbers.getPrimesWithSuffix('7');

        System.out.println(primes);
        System.out.println(suffixPrimes);
    }
}
