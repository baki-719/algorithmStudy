package programmers._old;

// codility
// 3줄만 바꿔라
public class ReverseInteger {

    public void solution(int N) {

        boolean isFirst = true;
        while (N > 0) {
            if (N % 10 != 0 || !isFirst) {
                System.out.print(N % 10);
            }
            N = N / 10;
            isFirst = false;
        }
    }

    public void solution2(int N) {

        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            } else if (enable_print > 0) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }

    }
}

