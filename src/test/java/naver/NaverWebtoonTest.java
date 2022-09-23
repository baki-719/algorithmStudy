package naver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaverWebtoonTest {

    NaverWebtoon solution = new NaverWebtoon();

    @Test
    void solution3() {
        Assertions.assertEquals(5, solution.solution3("aaaaabbbbb", "ab"));
    }

    @Test
    void solution2() {
        Assertions.assertArrayEquals(new String[]{"abc","xy","qwerty","xy","abc"}, solution.solution2("abcxyqwertyxyabc"));
    }
}