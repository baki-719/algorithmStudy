package yanolja.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RockScissorPaperTest {

    @Test
    void solution() {
        RockScissorPaper solution = new RockScissorPaper();
//        Assertions.assertEquals(4, solution.solution("SRR"));
        Assertions.assertEquals(10, solution.solution("PRPRRPP"));
    }
}