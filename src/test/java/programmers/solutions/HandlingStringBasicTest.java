package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.HandlingStringBasic;

import static org.junit.jupiter.api.Assertions.*;

class HandlingStringBasicTest {
    @Test
    void test() {
        HandlingStringBasic solutions = new HandlingStringBasic();
        assertFalse(solutions.solution("a234"));
        assertTrue(solutions.solution("1234"));
    }

}