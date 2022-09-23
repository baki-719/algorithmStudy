package programmers._old;

import java.util.Arrays;
import java.util.HashSet;

/*
 * @url   : https://programmers.co.kr/learn/courses/30/lessons/12901
 * @title : 2016년
 * @level : 1
 * @desc  :2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
 *         두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 *         요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다.
 *         예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
 * @constraints :
 * - 2016년은 윤년입니다.
 * - 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
 * */
public class Weekday {
    public String solution(int a, int b) {
        int days = 0;
        String[] weekDays = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        HashSet<Integer> thirtyOneDaysMonthSet = new HashSet<>(Arrays.asList(1,3,5,7,8,10,12));

        for(int i = 1; i < a; i++) {
            if(i == 2){
                days += 29;
            }else if (thirtyOneDaysMonthSet.contains(i)){
                days += 31;
            }else{
                days += 30;
            }
        }

        days += b;

        return weekDays[days % 7];
    }
}
