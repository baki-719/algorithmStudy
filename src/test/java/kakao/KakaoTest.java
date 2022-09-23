package kakao;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KakaoTest {
    Kakao kakao = new Kakao();

    @Test
    public void test() {

        assertEquals(-1, kakao.number1("asdf"));
    }

    @Test
    public void test2() {
        assertEquals(1, kakao.calFactorial(1));
        assertEquals(2, kakao.calFactorial(2));
        assertEquals(6, kakao.calFactorial(3));

    }

    @Test
    public void number2() {
        assertEquals(3636010, kakao.number2(5));
    }

    @Test
    public void number3() {
//        assertEquals(5, kakao.number3(List.of(10, 8, 9, 15,12,6,7)));
//        assertEquals(3, kakao.number3(List.of(5,1,2,1,4,5)));
//        assertEquals(5, kakao.number3(List.of(9,7,6,2,1)));
        List<Integer> temp = new ArrayList<>();
        for (int i = 100000; i > 0; i--)
            temp.add(i);

        assertEquals(100000, kakao.number3(temp));

    }

}