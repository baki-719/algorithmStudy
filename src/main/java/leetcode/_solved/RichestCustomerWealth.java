package leetcode._solved;

import java.util.Arrays;

// solved
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .map(customer -> Arrays.stream(customer).sum())
                .max(Integer::compareTo).get();
    }
}
