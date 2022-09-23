package programmers.lifeboat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(new int[]{70, 50, 80, 50}, 100));
        assertEquals(2, solution.solution(new int[]{40, 40, 40, 40}, 80));
        assertEquals(4, solution.solution(new int[]{40, 40, 40, 40}, 40));
        assertEquals(2, solution.solution(new int[]{40, 40, 40, 40}, 240));
        assertEquals(2, solution.solution(new int[]{40,50,150,160}, 200));
    }

}