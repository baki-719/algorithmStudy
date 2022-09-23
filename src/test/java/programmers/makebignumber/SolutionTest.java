package programmers.makebignumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        assertEquals( "9111", solution.solution("8889111", 3));
        assertEquals( "4", solution.solution("122233344", 8));
        assertEquals( "775841", solution.solution("4177252841", 4));
        assertEquals( "9", solution.solution("977777777777777", 14));

        StringBuilder sb = new StringBuilder();

        sb.append("9".repeat(999980));

        String expected = sb.toString();
        sb.append("8".repeat(10));

        for(int i = 0; i < 10; i++)
            sb.append(i);

        assertEquals( expected, solution.solution(sb.toString(), 20));
    }
}