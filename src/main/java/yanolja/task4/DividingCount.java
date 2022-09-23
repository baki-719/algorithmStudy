package yanolja.task4;

import java.util.stream.IntStream;

public class DividingCount {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 1;
        int max = A[0];
        int min = A[0];
        int nextStartIndex = 0;

        for(int i = 1; i < A.length; i++ ) {
            for (int j = i; j < A.length; j++) {
                if(A[j] < min) {
                    min = A[j];
                    nextStartIndex = 0;
                }
                if(A[j] > max) {
                    max = A[j];
                    if(nextStartIndex == 0) nextStartIndex = j;
                }
            }

            if(nextStartIndex > 1) {
                i = nextStartIndex;
                min = A[nextStartIndex];
                max = A[nextStartIndex];
                result++;
            } else break;
        }

        return result;
    }
}
