package leetcode._solved;

public class ShortestDistanceToCharacter {
    public int[] shortestToChar(String s, char c) {
//        int[] answer = new int[s.length()];
//
//        int lastZeroIndex = -1;
//
//        for (int i = 0; i < s.length(); i++) {
//            if(s.toCharArray()[i] == c) {
//                if(lastZeroIndex != -1)
//                    for (int j = i-1; j > lastZeroIndex + (i-lastZeroIndex)/2; j--) {
//                        answer[j] = answer[j+1]+1;
//                    }
//                lastZeroIndex = i;
//            } else if(lastZeroIndex == -1) {
//                for(int j = lastZeroIndex+1; j <= i; j++)
//                    answer[j]++;
//            } else {
//                answer[i] = answer[i-1]+1;
//            }
//        }
//        return answer;

        int N = s.length();
        int[] ans = new int[N];
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0; i < N; ++i) {
            if (s.charAt(i) == c) prev = i;
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = N-1; i >= 0; --i) {
            if (s.charAt(i) == c) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
}
