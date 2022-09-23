package programmers._old;


import java.util.*;


/*
 * @url   : https://programmers.co.kr/learn/courses/30/lessons/42839?language=java
 * @title : 소수 찾기
 * @level : 2
 * @desc  : 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
 *          각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때,
 *          종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
 * @constraints :
 * - numbers는 길이 1 이상 7 이하인 문자열입니다.
 * - numbers는 0~9까지 숫자만으로 이루어져 있습니다.
 * - "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
*  */
public class FindPrimeNumber2 {

    private Set<String> set = new HashSet<>();
    private int answer = 0;

    public int solution(String numbers) {
        List<Character> arr = new ArrayList<>();
        List<Character> result = new ArrayList<>();
        for(char temp : numbers.toCharArray()) arr.add(temp);

        for(int i = 1; i <= numbers.length(); i++) {
            permutation(arr, result, arr.size(), i);
        }

        return answer;
    }

    public boolean isPrime(int num) {

        if(num == 2) return true;
        if(num == 1 || num % 2 == 0) return false;

        for(int i = 3; i <= Math.sqrt(num); i+=2) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public void permutation(List<Character> arr, List<Character> result, int n, int r) {
        if(r == 0) {
            if (result.get(0) != '0') {

                String str = "";
                int size = result.size();
                for (int i = 0; i < size; i++) {
                    str += result.get(i);
                }

                int num = 0;

                // 이미 나온 숫자 조합이 아닐 경우
                if (!set.contains(str)) {
                    num = Integer.parseInt(str);
                    set.add(str);

                    // 소수 판별
                    if (isPrime(num)) {
                        System.out.println(num);
                        answer++;
                    }
                }
            }
            return;
        }

        for (int i = 0; i < n; i++) {

            result.add(arr.remove(i));
            permutation(arr, result, n - 1, r - 1);
            arr.add(i, result.remove(result.size() - 1));
        }
    }
}

