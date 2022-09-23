package yanolja.task1;

import java.util.Arrays;

import static java.util.stream.Collectors.groupingBy;

public class RockScissorPaper {

    public int solution(String G) {
        // write your code in Java SE 8

        // R = 82
        // P = 80
        // S = 83

        int[] countArr = new int[3];
        int[] pointArr = new int[3];

        for (char c : G.toCharArray()) {
            if(c == 82) countArr[0]++;
            if(c == 80) countArr[1]++;
            if(c == 83) countArr[2]++;
        }

       for(int j = 0; j < 3; j++) {
           pointArr[j] += countArr[j-1 < 0 ? 2 : j-1] * 2;
           pointArr[j] += countArr[j];
       }

        return Arrays.stream(pointArr).max().getAsInt();
    }
}