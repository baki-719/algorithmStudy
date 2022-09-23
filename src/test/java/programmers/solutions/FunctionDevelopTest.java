package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.FunctionDevelop;

import static org.junit.jupiter.api.Assertions.*;

class FunctionDevelopTest {

    @Test
    void test() {
        FunctionDevelop solutions = new FunctionDevelop();
        assertArrayEquals(new int[]{2,1}, solutions.solution(new int[]{93, 30, 55}, new int[]{1,30,5}));
        assertArrayEquals(new int[]{1,3,2}, solutions.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
    }
}