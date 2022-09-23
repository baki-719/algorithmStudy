package programmers._old;

/*
 * @url   : https://programmers.co.kr/learn/courses/30/lessons/12918
 * @title : 문자열 다루기 기본
 * @level : 1
 * @desc  : 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
 *          예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
 * @constraints :
 * - s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 * */
public class HandlingStringBasic {
    public boolean solution(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }

        return s.length() == 4 || s.length() == 6;
    }
}
