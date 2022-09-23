package programmers.network;

public class Solution {

    private int[][] computers;
    private int computerCount;
    private int[] visitArr;
    private int answer;

    public int solution(int n, int[][] computers) {
        this.computerCount = n;
        this.computers = computers;
        this.visitArr = new int[n];

        answer = 0;

        for(int i = 0; i < n; i++) {
            if(visitArr[i] == 1) {
                continue;
            }
            dfs(i);
            answer++;
        }

        return answer;
    }

    private void dfs(int index) {
        visitArr[index] = 1;

        for(int i = 0; i < computerCount; i++) {
            if(computers[index][i] == 1 && visitArr[i] == 0) {
                dfs(i);
            }
        }
    }

}
