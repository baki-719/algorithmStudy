package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.Carpet;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{4,3} , new Carpet().solution(10, 2));
        assertArrayEquals(new int[]{8,6} , new Carpet().solution(24, 24));
    }
}