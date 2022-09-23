package programmers._old;

/*
 * @url   : https://programmers.co.kr/learn/courses/30/lessons/12916
 * @title : 문자열 내 p와 y의 개수
 * @level : 1
 * @desc  : 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 *          s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * @constraints :
 * - str은 길이 1 이상인 문자열입니다.
 * */
public class SortStringByDesc {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        int[] arr = s.chars().sorted().toArray();

        for(int i = arr.length-1; i >= 0; i--){
            answer.append((char) arr[i]);
        }

        return answer.toString();
    }
}
