package programmers.kakaocommerce;

import kakaocommerce.GiftCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GiftCardTest {

    @Test
    void solution() {
        GiftCard solution = new GiftCard();
        Assertions.assertEquals(1, solution.solution(new int[]{4, 5, 3, 2, 1}, new int[]{2, 4, 4, 5, 1}));
        Assertions.assertEquals(3, solution.solution(new int[]{5, 4, 5, 4, 5}, new int[]{1, 2, 3, 5, 4}));
        Assertions.assertEquals(5, solution.solution(new int[]{1, 1, 1, 1, 1}, new int[]{2, 2, 3, 5, 4}));
        Assertions.assertEquals(2, solution.solution(new int[]{5, 5, 5, 2, 1}, new int[]{1, 3, 2, 5, 4}));
    }
}