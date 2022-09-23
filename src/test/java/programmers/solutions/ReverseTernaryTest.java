package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.ReverseTernary;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTernaryTest {

    @Test
    void test() {
        ReverseTernary solutions = new ReverseTernary();
        assertEquals(7, solutions.solution(45));
        assertEquals(229, solutions.solution(125));
    }

}