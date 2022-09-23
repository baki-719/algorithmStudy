package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.Sportswears;

import static org.junit.jupiter.api.Assertions.*;

class SportswearsTest {

    @Test
    void test() {
        Sportswears solution = new Sportswears();
        assertEquals(5, solution.solution(5, new int[]{2,4}, new int[]{1,3,5}));
        assertEquals(4, solution.solution(5, new int[]{2,4}, new int[]{3}));
        assertEquals(2, solution.solution(3, new int[]{3}, new int[]{1}));
        assertEquals(2, solution.solution(2, new int[]{}, new int[]{1,2}));
        assertEquals(5, solution.solution(6, new int[]{1,2}, new int[]{1}));
        assertEquals(30, solution.solution(30, new int[]{1,2,3}, new int[]{1,2,3}));
        assertEquals(0, solution.solution(3, new int[]{1,2,3}, new int[]{}));
        assertEquals(1, solution.solution(3, new int[]{1,2,3}, new int[]{3}));
    }

}