package programmers.kakaocommerce;

import kakaocommerce.Terminus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TerminusTest {

    @Test
    void solution() {
        Terminus solution = new Terminus();
        Assertions.assertArrayEquals(new int[]{6, 3}, solution.solution(6, new int[] {1,1,1,1,1,1}, new int[][]{{1,2},{1,3},{1,4},{3,5},{3,6}}));
        Assertions.assertArrayEquals(new int[]{4, 5}, solution.solution(4, new int[] {2,1,2,2}, new int[][]{{1,2},{1,3},{2,4}}));
        Assertions.assertArrayEquals(new int[]{5, 5}, solution.solution(5, new int[] {1,1,2,3,4}, new int[][]{{1,2},{1,3},{1,4},{1,52222}}));
    }
}