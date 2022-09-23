package programmers.network;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
        assertEquals(1, solution.solution(3, new int[][]{{1,1,0},{1,1,1},{0,1,1}}));
    }
}