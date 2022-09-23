package programmers.solutions;

import org.junit.jupiter.api.Test;
import programmers._old.BestAlbum;

class BestAlbumTest {

    @Test
    void test(){
        BestAlbum solutions = new BestAlbum();
        solutions.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
    }
}