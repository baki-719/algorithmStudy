package leetcode._solved;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import static java.util.stream.Collectors.toList;

public class KthLargest {

    private int k;
    private PriorityQueue<Integer> priorityQueue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            priorityQueue.offer(num);
        }
    }

    public int add(int val) {
        priorityQueue.offer(val);
        PriorityQueue<Integer> tempQueue = new PriorityQueue<>(priorityQueue);
        for (int i = 0; i < k; i++) {
            if(i == k-1) return tempQueue.poll();
            tempQueue.poll();
        }

        return 0;
    }
}
