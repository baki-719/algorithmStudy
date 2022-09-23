package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.TruckPassingThruBridge;

import static org.junit.jupiter.api.Assertions.*;

class TruckPassingThruBridgeTest {

    @Test
    void solution() {
        assertEquals(110, new TruckPassingThruBridge().solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}));
    }
}