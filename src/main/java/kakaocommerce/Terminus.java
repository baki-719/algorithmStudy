package kakaocommerce;

import java.util.Arrays;
import java.util.LinkedList;

public class Terminus {

    boolean[] visited;
    LinkedList<Integer>[] adjList;
    int[] passenger;
    int[] sumPassenger;

    public int[] solution(int n, int[] passenger, int[][] train) {
        int[] answer = {};
        visited = new boolean[n];
        adjList = new LinkedList[n];
        this.passenger = passenger;
        sumPassenger = new int[n];

        for (int i = 0; i < n; ++i)
            adjList[i] = new LinkedList<>();

        for (int[] temp : train) {
            adjList[temp[0]-1].add(temp[1]-1);
        }

        DFS(0, 0);

        int max = 0;
        int index = 0;
        for(int i = 0; i < sumPassenger.length; i++) {
            if(max <= sumPassenger[i]) {
                max = sumPassenger[i];
                index = i;
            }

        }

        return new int[] {index+1 , max};
    }

    void DFS(int node, int tempSum) {
        tempSum += passenger[node];
        visited[node] = true;

        for (int next : adjList[node]) {
            if(!visited[next])
                DFS(next, tempSum);
        }
        sumPassenger[node] = tempSum;
    }

}
