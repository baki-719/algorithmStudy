package yanolja.task3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveOneCountToNotDistinctTest {

    @Test
    public void test() {
        MoveOneCountToNotDistinct test = new MoveOneCountToNotDistinct();
        System.out.println(Arrays.toString(test.solution(new int[]{1, 2,3,4})));
    }

    @Test
    public void test2() {
        MoveOneCountToNotDistinct test = new MoveOneCountToNotDistinct();
        test.test2();
    }

}