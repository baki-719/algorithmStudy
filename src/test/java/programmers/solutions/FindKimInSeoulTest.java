package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.FindKimInSeoul;

import static org.junit.jupiter.api.Assertions.*;

class FindKimInSeoulTest {

    @Test
    void test() {
        FindKimInSeoul solutions = new FindKimInSeoul();
        assertEquals("김서방은 1에 있다", solutions.solution(new String[]{"Jane", "Kim"}));
    }
}