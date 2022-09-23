package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.SortStringByDesc;

import static org.junit.jupiter.api.Assertions.*;

class SortStringByDescTest {
    @Test
    void test() {
        SortStringByDesc solutions = new SortStringByDesc();
        assertEquals("gfedcbZ", solutions.solution("Zbcdefg"));
    }
}