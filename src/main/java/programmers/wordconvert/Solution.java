package programmers.wordconvert;

import java.util.*;

public class Solution {

    private boolean[] isVisited;
    private String[] words;
    private Queue<Set<String>> queue;

    public int solution(String begin, String target, String[] words) {
        this.isVisited = new boolean[words.length];
        this.queue = new LinkedList<>();
        this.words = words;
        int answer = -1;

        queue.add(Set.of(begin));

        while(!queue.isEmpty()) {
            Set<String> nowList = queue.poll();
            answer++;

            if(nowList.stream().anyMatch(target::equals)) {
                break;
            }

            Set<String> nextList = getAvailableStringList(nowList);
            if(nextList.isEmpty()) {
                answer = 0;
                break;
            }

            queue.add(nextList);
        }

        return answer;
    }

    private boolean canVisit(String start, String target) {

        int differentCount = 0;

        for(int i = 0; i < start.length(); i++) {
            if(start.toCharArray()[i] != target.toCharArray()[i]) {
                differentCount++;
                if(differentCount > 1)
                    return false;
            }
        }

        return differentCount == 1;
    }

    private Set<String> getAvailableStringList(Set<String> nowList) {
        Set<String> result = new HashSet<>();

        nowList.forEach(str -> {
            for(int i = 0 ; i < words.length; i++) {
                if(!isVisited[i] && canVisit(str, words[i])) {
                    result.add(words[i]);
                    isVisited[i] = true;
                }
            }
        });

        return result;
    }
}
