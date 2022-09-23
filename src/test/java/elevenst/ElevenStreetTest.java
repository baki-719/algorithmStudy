package elevenst;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ElevenStreetTest {

    ElevenStreet elevenStreet = new ElevenStreet();

    @Test
    public void calSumOfDigit() {
        assertEquals(1, elevenStreet.calSumOfDigit(10));
    }

    @Test
    public void solution() {
        assertEquals(37, elevenStreet.solution(28));
    }

    @Test
    public void solution2() {
        int[] input = new int[] {
                1,1,2,3,3
        };

        assertTrue(elevenStreet.solution2(input, 3));
    }
}