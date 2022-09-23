package elevenst;

import java.util.Arrays;

public class ElevenStreet {

    public int solution(int N) {

        int goalValue = calSumOfDigit(N);
        int result = N;

        do {
            result++;
        } while (calSumOfDigit(result) != goalValue);

        return result;
    }

    public int calSumOfDigit(int n) {
        String strNum = String.valueOf(n);

        return Arrays.stream(strNum.split(""))
                .mapToInt(Integer::parseInt).sum();
    }

    public boolean solution2(int[] A, int K) {
        int n = A.length;
        for (int i = 0; A[i] <= K && i < n-1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 || A[n - 1] < K || A[K - 1] > K)
            return false;
        else
            return true;
    }

}

interface A {
    void test();
}

abstract class B implements A {

}

class C extends B {

    public void test() {

    }
}

class D extends C{
    void test(int a) {}
}
