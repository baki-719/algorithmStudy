package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.Weekday;

import static org.junit.jupiter.api.Assertions.*;

class WeekdayTest {

    @Test
    void test() {
        Weekday solutions = new Weekday();
        assertEquals("TUE", solutions.solution(5, 24));
    }

}