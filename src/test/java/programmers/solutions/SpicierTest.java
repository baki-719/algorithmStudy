package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.Spicier;

import static org.junit.jupiter.api.Assertions.*;

class SpicierTest {

    @Test
    void solution() {
        assertEquals(2, new Spicier().solution(new int[]{1, 2, 3, 9, 10, 12}, 7));

    }
}