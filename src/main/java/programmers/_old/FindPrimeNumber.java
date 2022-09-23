package programmers._old;

import java.util.Arrays;

/*
 * @url   : https://programmers.co.kr/learn/courses/30/lessons/12921
 * @title : 소수 찾기
 * @level : 1
 * @desc  : 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 *          소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.(1은 소수가 아닙니다.)
 * @constraints :
 * - n은 2이상 1000000이하의 자연수입니다.
 * */
public class FindPrimeNumber {
    public int solution(int n) {
        int[] arr = new int[n+1];
        arr[0] = arr[1] = 1;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(arr[i] == 1) continue;

            for(int j = i*i; j < arr.length; j=j+i) {
                arr[j] = 1;
            }
        }

        return (int) Arrays.stream(arr).filter(x -> x == 0).count();
    }
}
