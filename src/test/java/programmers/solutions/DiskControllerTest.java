package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.DiskController;

import static org.junit.jupiter.api.Assertions.*;

class DiskControllerTest {

    @Test
    void solution() {
        assertEquals(9, new DiskController().solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}));
    }
}