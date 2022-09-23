package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.FindPrimeNumber;

import static org.junit.jupiter.api.Assertions.*;

class FindPrimeNumberTest {

    @Test
    void test() {
        FindPrimeNumber solutions = new FindPrimeNumber();
        assertEquals(4, solutions.solution(10));
        assertEquals(3, solutions.solution(5));
    }
}