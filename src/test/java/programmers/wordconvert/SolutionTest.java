package programmers.wordconvert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}));
    }

}