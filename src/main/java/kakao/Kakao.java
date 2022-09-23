package kakao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kakao {

    public int number3(List<Integer> arr) {
        int result = 0;

        for (int i = 0; i < arr.size(); i++) {
            int mid = i;
            int left = i == 0 ? 0 :i - 1;
            int right = i == arr.size()-1 ? arr.size()-1 : i + 1;

            if (arr.get(left) < arr.get(mid) && arr.get(mid) < arr.get(right)) continue;
            if (arr.get(left) > arr.get(mid) && arr.get(mid) > arr.get(right)) continue;

            for (left = i - 1; left > -1; left--) {
                if(arr.get(mid) < arr.get(left)) break;
                mid--;
            }

            mid = i;
            for (right = i + 1; right < arr.size(); right++) {
                if(arr.get(mid) < arr.get(right)) break;
                mid++;
            }
            if (result < right - left - 1) result = right - left - 1;
        }


        return result;
    }


    int[] memo = new int[1000000];
    Set<Integer> squad = new HashSet<>();

    public int number2(int n) {
        squad.add(n);
        int nextPower = 0;

        String[] strNumArr = String.valueOf(n).split("");

        for (String temp : strNumArr) {
            nextPower += calFactorial(Integer.parseInt(temp));
        }

        if (!squad.contains(nextPower)) {
            number2(nextPower);
        }

        return squad.stream()
                .mapToInt(i -> i)
                .max().orElse(0) * squad.size();
    }

    public int calFactorial(int n) {
        if (memo[n] == 0) {
            if (n <= 0) {
                memo[n] = 1;
                return 1;
            }
            if (n < 3 && n > 0) {
                memo[n] = n;
                return n;
            } else {
                memo[n] = calFactorial(n - 1) * n;
                return memo[n];
            }
        } else {
            return memo[n];
        }
    }

    public int number1(String s) {
        // Write your code here
        String[] strArr = s.split("");
        Set<String> strSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!strSet.contains(strArr[i])) {
                if (s.lastIndexOf(strArr[i]) != i) {
                    strSet.add(strArr[i]);
                } else {
                    return i + 1;
                }
            }
        }

        return -1;
    }
}
