package programmers.connectisland;

import java.util.Arrays;

public class Solution {
    public int solution(int n, int[][] costs) {
        int answer = Integer.MAX_VALUE;
        int[][] islandMap = new int[n][n];

        for (int[] cost : costs) {
            islandMap[cost[0]][cost[1]] = cost[2];
            islandMap[cost[1]][cost[0]] = cost[2];
        }

        for(int i = 0; i < islandMap.length; i++) {
            boolean[] check = new boolean[n];
            check[i] = true;

            int sum = 0;
            int count = 0;
            boolean isFinish = false;
            int j = i;
            while (!isFinish) {
                int nextIsland = findCheapestIsland(check, islandMap[j]);
                check[nextIsland] = true;
                sum += islandMap[j][nextIsland];
                j = nextIsland;
                count++;

                if(count == n-1) isFinish = true;
            }

            if (answer > sum)
                answer = sum;
        }

        return answer;
    }

    public int findCheapestIsland(boolean[] check, int[] map) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        for(int i = 0; i < map.length; i++) {
            if(check[i] || map[i] == 0) continue;
            if(min > map[i]) {
                min = map[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}