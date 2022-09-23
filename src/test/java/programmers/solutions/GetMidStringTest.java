package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.GetMidString;

import static org.junit.jupiter.api.Assertions.*;

class GetMidStringTest {

    @Test
    void test() {
        GetMidString solutions = new GetMidString();
        assertEquals("c", solutions.solution("abcde"));
        assertEquals("we", solutions.solution("qwer"));
    }
}