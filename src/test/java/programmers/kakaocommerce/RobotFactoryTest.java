package programmers.kakaocommerce;

import kakaocommerce.RobotFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RobotFactoryTest {

    @Test
    void solution() {
        RobotFactory solution = new RobotFactory();
        Assertions.assertEquals(4,solution.solution(new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}}, 2));
        Assertions.assertEquals(6,solution.solution(new int[][]{{1, 1, 0}, {1, 1, 0}, {1, 1, 0}, {1, 1, 0}, {1, 1, 0}, {0, 1, 1}}, 3));
    }
}