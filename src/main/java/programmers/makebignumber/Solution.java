package programmers.makebignumber;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public String solution(String number, int k) {
        return otherSolution(number, k);
    }

    public String otherSolution(String number, int k) {
        char[] res = new char[number.length()-k];
        Stack<Character> st = new Stack<>();

        for(int i=0; i<number.length();i++){
            char c = number.charAt(i);
            while(!st.isEmpty() && st.peek()<c && k-->0) st.pop();
            st.push(c);
        }

        for(int i=0; i<res.length; i++){
            res[i] = st.get(i);
        }




        return new String(res);
    }

    public String mySolution(String number, int k) {
        List<Character> numberList = new LinkedList<>();
        for(char temp : number.toCharArray())
            numberList.add(temp);

        int max = numberList.stream().mapToInt(c -> c - '0').max().getAsInt();
        long maxCount = numberList.parallelStream()
                .mapToInt(c -> c-'0')
                .filter(e -> e == max)
                .count();

        if(number.length()-k < maxCount) {
            return String.valueOf(max).repeat(Math.max(0, number.length() - k));
        }

        StringBuilder sb = new StringBuilder(number);

        for (int i = 0; i < k; i++){
            int before = sb.length();
            for (int j = 0; j < sb.length()-1; j++) {
                if(sb.charAt(j) < sb.charAt(j+1)) {
                    sb.deleteCharAt(j);
                    break;
                }
            }
            int after = sb.length();

            if(before == after) {
                sb.delete(sb.length()-k+i, sb.length());
                break;
            }
        }

        return sb.toString();
    }
}