package programmers.targetnumber;

public class Solution {

    private int[] numbers;
    private int target;
    private int answer;

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        this.answer = 0;

        dfs(0, numbers[0], 0);
        dfs(0, -1 * numbers[0], 0);

        return answer;
    }

    private void dfs(int sum, int number, int index) {
        sum += number;

        if(index == numbers.length-1 ) {
            if(target == sum) answer++;
            return;
        }

        index++;

        dfs(sum, numbers[index], index);
        dfs(sum, -1 * numbers[index], index);
    }
}


