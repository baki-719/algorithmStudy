package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.SumTwoNumber;

import static org.junit.jupiter.api.Assertions.*;

class SumTwoNumberTest {


    @Test
    void test(){
        SumTwoNumber solution = new SumTwoNumber();

        assertArrayEquals(new int[]{2,3,4,5,6,7}, solution.solution(new int[]{2,1,3,4,1}));
        assertArrayEquals(new int[]{2,5,7,9,12}, solution.solution(new int[]{5,0,2,7}));
    }

}