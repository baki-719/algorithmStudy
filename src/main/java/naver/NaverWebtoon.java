package naver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NaverWebtoon {

    //문제 설명
    //쿠폰을 사용하면 물건을 살 때 할인을 받을 수 있습니다. 쿠폰이 여러 장 주어졌을 때, 쿠폰을 적절히 사용해 할인을 최대한 많이 받으려고 합니다. 한 제품에는 쿠폰을 하나만 적용할 수 있으며, 사용한 쿠폰은 사라집니다.
    //
    //주문할 제품의 가격 prices, 쿠폰별 할인율 discounts가 매개변수로 주어집니다. 할인을 최대한 많이 받도록 쿠폰을 적용했을 때 얼마를 내야 하는지 return 하도록 solution 함수를 완성해주세요.
    //
    //제한 사항
    //prices 배열의 길이는 1 이상 1,000 이하입니다.
    //prices 배열의 원소는 5,000 이상 150,000 이하인 자연수이며, 항상 100으로 나누어 떨어집니다.
    //discounts 배열의 길이는 1 이상 1,000 이하입니다.
    //discounts 배열의 원소는 1 이상 100 이하인 자연수입니다.

    public int solution1(int[] prices, int[] discounts) {
        int answer = 0;

        Arrays.sort(prices);
        Arrays.sort(discounts);

        int discountIndex = discounts.length-1;

        for(int i = prices.length-1 ; i >= 0; i--) {
            if(discountIndex >= 0) {
                answer += (prices[i] / 100) * (100 - discounts[discountIndex]);
                discountIndex--;
            } else {
                answer += prices[i];
            }
        }

        return answer;
    }

    //문제 설명
    //문자열 s가 주어질 때, s를 가능한 많은 개수의 "문자열 조각"으로 자르려 합니다. 단, 잘린 "문자열 조각"을 앞에서부터 순서대로 s(1), s(2), s(3), ..., s(n)이라고 했을 때, 다음 조건을 만족해야 합니다.
    //
    //1 ≤ i ≤ (n+1)/2 인 모든 자연수 i에 대해서, s(i) = s(n - i + 1)
    //예를 들어 문자열 "abcxyasdfasdfxyabc"을 "abc", "xy", "asdf", "asdf", "xy", "abc"로 자르고, 각 문자열 조각을 순서대로 s1, s2, s3, s4, s5, s6이라고 하겠습니다.
    //
    //"abc" = s1
    //"xy" = s2
    //"asdf" = s3
    //"asdf" = s4
    //"xy" = s5
    //"abc" = s6
    //이때, s1 = s6, s2 = s5, s3 = s4로 위 조건을 만족하며, 이보다 더 많은 개수의 "문자열 조각"으로 자르면서 조건을 만족하도록 하는 방법은 없습니다.
    //
    //문자열 s가 매개변수로 주어질 때, 조건에 맞게 s를 "문자열 조각"으로 자른 후 순서대로 배열에 담아 return 하도록 solution 함수를 완성해주세요.
    public String[] solution2(String s) {
        //abcxyqwertyxyabc
        List<String> result = new ArrayList<>();
        char[] charArr = s.toCharArray();

        List<Character> left = new ArrayList<>();
        List<Character> right = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = s.length()-1;

        while(leftIndex < rightIndex) {
            left.add(charArr[leftIndex]);
            right.add(charArr[rightIndex]);

            if(isSame(left, right)) {
                StringBuilder sb = new StringBuilder();
                for (Character temp : left) {
                    sb.append(temp);
                }
                result.add(sb.toString());
                left = new ArrayList<>();
                right = new ArrayList<>();
            }
            leftIndex++;
            rightIndex--;
        }
        int additionalAnswerSize = left.size() > 0 ? 1 : 0;
        String[] answer = new String[result.size() * 2 + additionalAnswerSize];
        int answerIndex = 0;

        for(int i = 0 ; i < result.size(); i ++ ) {
            answer[answerIndex] = result.get(i);
            answerIndex++;
        }

        if(left.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (Character temp : left) {
                sb.append(temp);
            }
            for (int i = right.size()-1; i >= 0; i--) {
                sb.append(right.get(i));
            }

            answer[answerIndex] = sb.toString();
            answerIndex++;
        }

        for(int i = result.size()-1; i >= 0; i--) {
            answer[answerIndex] = result.get(i);
            answerIndex++;
        }

        return answer;
    }

    public boolean isSame(List<Character> left, List<Character> right) {
        for(int i = 0 ; i < left.size(); i++) {
            if(right.get(right.size() - i - 1) != left.get(i)) return false;
        }

        return true;
    }

    //문제 설명
    //문서 편집기에는 찾아 바꾸기라는 기능이 있습니다. 찾아 바꾸기를 이용하여 파일에서 바꿀 문자열을 찾은 뒤, 그 문자열이 발견되면 그 문자열을 제거하는 과정을 진행합니다. 찾아 바꾸기는 한 번에 한 개의 문자열만 제거할 수 있습니다. 따라서 제거할 문자열이 여러 번 나타나거나, 문자열을 제거한 결과가 또 다시 바꿀 문자열과 같아지는 경우 한번 더 찾아 바꾸기를 해야 합니다.
    //
    //예를 들어, aabcbcd 문자열에서 abc 라는 문자열을 제거하고 싶을 때,찾아 바꾸기를 1번 실행하면 abcd가 됩니다.이 때, abc가 1번 더 생기게 되므로, 한번 더 찾아 바꾸기를 실행하여 d로 바꿀 수 있습니다. 더 이상 abc 문자열이 존재하지 않으므로 총 2번의 찾아 바꾸기 과정을 통해 문자열을 모두 바꿀 수 있습니다.
    //
    //검색하고자 하는 문장 s에서 문자열 t를 찾아 제거할 때, 총 몇 번의 찾아 바꾸기를 진행해야 문장 s에서 t가 더이상 존재하지 않는지 계산하는 함수를 완성하세요.
    public int solution3(String s, String t) {
        int result = -1;
        String[] splitArr = new String[5];
        StringBuilder sb = new StringBuilder();

        while (splitArr.length > 1) {
            result++;
            splitArr = s.split(t);
            sb = new StringBuilder();
            for(String temp : splitArr) {
                sb.append(temp);
            }
            s = sb.toString();
        }

        if(s.equals("")) result++;

        return result;
    }
}
