package br.com.cit.dojo.ex3;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class PrimeNumbersTest {

    @Before
    public void setup() {
    }

    @Test
    public void shouldGetPrimes() {
        List<Integer> primes = PrimeNumbers.getPrimes();

        List<Integer> correctAnswer = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        assertTrue(CollectionUtils.isEqualCollection(primes, correctAnswer));
    }

    @Test
    public void shouldGetPrimesWithSuffix7() {
        List<Integer> primes = PrimeNumbers.getPrimesWithSuffix('7');

        List<Integer> correctAnswer = Arrays.asList(7, 17, 37, 47, 67, 97);
        assertTrue(CollectionUtils.isEqualCollection(primes, correctAnswer));
    }

    @Test
    public void shouldGetPrimesWithSuffix0() {
        List<Integer> primes = PrimeNumbers.getPrimesWithSuffix('0');

        List<Integer> correctAnswer = Arrays.asList();
        assertTrue(CollectionUtils.isEqualCollection(primes, correctAnswer));
    }

    @Test
    public void shouldGetPrimesWithSuffix2() {
        List<Integer> primes = PrimeNumbers.getPrimesWithSuffix('2');

        List<Integer> correctAnswer = Arrays.asList(2);
        assertTrue(CollectionUtils.isEqualCollection(primes, correctAnswer));
    }

    @Test
    public void shouldGetPrimesWithSuffix4() {
        List<Integer> primes = PrimeNumbers.getPrimesWithSuffix('4');

        List<Integer> correctAnswer = Arrays.asList();
        assertTrue(CollectionUtils.isEqualCollection(primes, correctAnswer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGetPrimesWithSuffixA() {
        PrimeNumbers.getPrimesWithSuffix('A');
    }
}
