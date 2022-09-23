package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.DividableNumberArray;

import static org.junit.jupiter.api.Assertions.*;

class DividableNumberArrayTest {
    @Test
    void test() {
        DividableNumberArray solutions = new DividableNumberArray();
        assertArrayEquals(new int[]{5,10}, solutions.solution(new int[]{5,9,7,10}, 5));
        assertArrayEquals(new int[]{1, 2, 3, 36}, solutions.solution(new int[]{2, 36, 1, 3}, 1));
        assertArrayEquals(new int[]{-1}, solutions.solution(new int[]{3,2,6}, 10));
    }
}