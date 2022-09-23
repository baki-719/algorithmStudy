package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.FindPrimeNumber2;

import static org.junit.jupiter.api.Assertions.*;

class FindPrimeNumber2Test {

    @Test
    void solution() {
        assertEquals(3, new FindPrimeNumber2().solution("17"));
        assertEquals(2, new FindPrimeNumber2().solution("011"));
    }

    @Test
    void isPrime() {
        assertFalse(new FindPrimeNumber2().isPrime(10));
    }
}