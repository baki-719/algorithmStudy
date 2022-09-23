package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.NoSameNum;

import static org.junit.jupiter.api.Assertions.*;

class NoSameNumTest {

    @Test
    void test(){
        NoSameNum solutions = new NoSameNum();

        assertArrayEquals(new int[]{1,3,0,1},solutions.solution(new int[]{1,1,3,3,0,1,1}));
        assertArrayEquals(new int[]{4,3},solutions.solution(new int[]{4,4,4,3,3}));
        assertArrayEquals(new int[]{1},solutions.solution(new int[]{1,1,1,1,1,1}));
    }

}
