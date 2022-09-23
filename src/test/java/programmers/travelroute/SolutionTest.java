package programmers.travelroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
//        assertArrayEquals(new String[]{"ICN", "A", "C", "A", "B", "D"}, solution.solution(
//                new String[][]{new String[]{"ICN", "A"}, new String[]{"A", "B"}, new String[]{"A", "C"}, new String[]{"C", "A"}, new String[]{"B", "D"}}));
//        assertArrayEquals(new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"}, solution.solution(
//                new String[][]{new String[]{"ICN", "SFO"}, new String[]{"ICN", "ATL"}, new String[]{"SFO", "ATL"}, new String[]{"ATL", "ICN"}, new String[]{"ATL", "SFO"}}));
//        assertArrayEquals(new String[]{"ICN", "C", "ICN", "B", "D"}, solution.solution(
//                new String[][]{new String[]{"ICN", "C"}, new String[]{"ICN", "B"}, new String[]{"C", "ICN"}, new String[]{"B", "D"}}));
//        assertArrayEquals(new String[]{"ICN", "B", "C", "ICN", "C", "B"}, solution.solution(
//                new String[][]{new String[]{"ICN", "B"}, new String[]{"ICN", "C"}, new String[]{"B", "C"}, new String[]{"C", "B"}, new String[]{"C", "ICN"}}));
        assertArrayEquals(new String[]{"ICN","B","D","C","D","B","ICN","C","B"}, solution.solution(
                new String[][]{new String[]{"ICN", "B"}, new String[]{"ICN", "C"}, new String[]{"C", "D"}, new String[]{"D", "C"}, new String[]{"B", "D"}, new String[]{"D", "B"}, new String[]{"B", "ICN"}, new String[]{"C", "B"}}));
        assertArrayEquals(new String[]{"ICN", "A", "C", "A", "B", "D"}, solution.solution(
                new String[][]{new String[]{"ICN", "A"}, new String[]{"A", "B"}, new String[]{"A", "C"}, new String[]{"C", "A"} , new String[]{"B", "D"}}));
    }

}