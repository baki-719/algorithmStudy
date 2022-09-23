package programmers._old;


/*
 * @url   : https://programmers.co.kr/learn/courses/30/lessons/12903
 * @title : 가운데 글자 가져오기
 * @level : 1
 * @desc  : 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * @constraints :
 * - s는 길이가 1 이상, 100이하인 스트링입니다.
 * */
public class GetMidString {
    public String solution(String s) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        int midIndex = s.length()/2;

        if(s.length() % 2 == 1) {
            sb.append(s.toCharArray()[midIndex]);
        } else {
            sb.append(s.toCharArray()[midIndex-1]);
            sb.append(s.toCharArray()[midIndex]);
        }

        return sb.toString();
    }
}
