package programmers._old;

/*
 * @url   : https://programmers.co.kr/learn/courses/30/lessons/68935
 * @title : 3진법 뒤집기
 * @level : 1
 * @desc  : 자연수 n이 매개변수로 주어집니다.
 *          n을 3진법 상에서 앞뒤로 뒤집은 후,
 *          이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 * @constraints :
 * - n은 1 이상 100,000,000 이하인 자연수입니다.
 * */
public class ReverseTernary {
    public int solution(int n) {
        return convertBase10(convertTernaryAndReverse(n));
    }

    public String convertTernaryAndReverse(int n) {
        StringBuilder builder = new StringBuilder();
        while(n != 0) {
            builder.append(n%3);
            n /= 3;
        }

        return builder.toString();
    }

    public int convertBase10(String n) {
        int result = 0;

        for(int i = 0 ; i < n.length(); i++) {
            int a = 1;
            for(int j = 0; j < n.length()-i-1; j++) {
                a *= 3;
            }

            result += a * Character.getNumericValue(n.toCharArray()[i]);
        }

        return result;
    }
}
