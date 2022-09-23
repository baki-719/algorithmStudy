package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.BiggestNumber;

import static org.junit.jupiter.api.Assertions.*;

class BiggestNumberTest {

    @Test
    void test(){
        BiggestNumber solutions = new BiggestNumber();
//        System.out.println(programmers.solutions.compare("34", "3"));
        assertEquals("9534330",
                solutions.solution(new int[]{3, 30, 34, 5, 9}));
        assertEquals("0",
                solutions.solution(new int[]{0,0,0,0,0,0}));
    }

}