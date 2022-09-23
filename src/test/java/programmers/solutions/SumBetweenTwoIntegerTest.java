package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.SumBetweenTwoInteger;

import static org.junit.jupiter.api.Assertions.*;

class SumBetweenTwoIntegerTest {

    @Test
    void test(){
        SumBetweenTwoInteger solution = new SumBetweenTwoInteger();

        assertEquals(12, solution.solution(3,5));
        assertEquals(3, solution.solution(3,3));
        assertEquals(12, solution.solution(5,3));
    }
}