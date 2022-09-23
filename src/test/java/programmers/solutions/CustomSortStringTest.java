package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.CustomSortString;

import static org.junit.jupiter.api.Assertions.*;

class CustomSortStringTest {
    @Test
    void test() {
        CustomSortString solutions = new CustomSortString();
//        assertArrayEquals(new String[]{"car","bed","sun"}, programmers.solutions.solution(new String[]{"sun", "bed", "car"}, 1));
//        assertArrayEquals(new String[]{"abcd", "abce", "cdx"}, programmers.solutions.solution(new String[]{"abce", "abcd", "cdx"}, 2));
        assertArrayEquals(new String[]{"bab", "aba", "abc"}, solutions.solution(new String[]{"abc", "aba", "bab"}, 1));
    }

}