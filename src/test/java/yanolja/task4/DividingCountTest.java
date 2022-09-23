package yanolja.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividingCountTest {

    @Test
    void solution() {
        DividingCount solution = new DividingCount();
        Assertions.assertEquals(3, solution.solution(new int[] {2,4,1,6,5,9,7}));
        Assertions.assertEquals(1, solution.solution(new int[] {4,3,2,6,1}));
        Assertions.assertEquals(3, solution.solution(new int[] {2,1,6,4,3,7}));
        Assertions.assertEquals(1, solution.solution(new int[] {9,6,3,1}));
        Assertions.assertEquals(1, solution.solution(new int[] {1,2,3,4,6,5}));
    }
}