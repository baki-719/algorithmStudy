package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.CountOfPAndYInString;

import static org.junit.jupiter.api.Assertions.*;

class CountOfPAndYInStringTest {

    @Test
    void test() {
        CountOfPAndYInString solutions = new CountOfPAndYInString();
        assertTrue(solutions.solution("pPoooyY"));
        assertFalse(solutions.solution("Pyy"));
    }

}