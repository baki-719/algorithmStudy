package programmers._old;

import java.util.*;
import java.util.stream.Collectors;

/*
 * @url   : https://programmers.co.kr/learn/courses/30/lessons/42746
 * @title : 가장 큰 수
 * @level : 2
 * @desc  : 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
            예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
            0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때,
            순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
 * @constraints :
 * - numbers의 길이는 1 이상 100,000 이하입니다.
 * - numbers의 원소는 0 이상 1,000 이하입니다.
 * - 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.

 * */
public class BiggestNumber {
//    public String solution(int[] numbers) {
//
//    }

    // runtime error
    public String solution(int[] numbers) {

        String result = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted(this::compare)
                .collect(Collectors.joining());

        return result.startsWith("0") ? "0" : result;
    }

    public int compare(String a, String b) {
        if(a.equals(b)) return 0;

        String sum1 = a + b;
        String sum2 = b + a;

        if(Integer.parseInt(sum1) > Integer.parseInt(sum2)) return -1;
        else return 1;

//        int i = 0;
//        int j = 0;
//        int aLen = a.length();
//        int bLen = b.length();
//
//        while(true) {
//            if(a.charAt(i) > b.charAt(j)) return -1;
//            else if (a.charAt(i) < b.charAt(j)) return 1;
//            else {
//                if(aLen == bLen) {i++;j++;}
//                else if(aLen > bLen) i++;
//                else j++;
//            }
//        }
    }
}
