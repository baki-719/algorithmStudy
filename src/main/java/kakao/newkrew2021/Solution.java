package kakao.newkrew2021;

public class Solution {
    public int solution(int[][] board, int[][] skill) {
        int answer = 0;

        for (int i = 0; i < skill.length; i++) {
            int type = skill[i][0];
            int x1 = skill[i][1];
            int y1 = skill[i][2];
            int x2 = skill[i][3];
            int y2 = skill[i][4];
            int degree = skill[i][5];

            cal(board, type, x1, y1, x2, y2, degree);

        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] > 0) answer++;
        }

        return answer;
    }

    public void cal(int[][] board, int type, int x, int y, int x2, int y2, int degree) {
        for (int i = x; i <= x2; i++) {
            for (int j = y; j < y2; j++) {
                if (type == 1) board[i][j] += degree;
                else board[i][j] -= degree;

                if (board[i][j] <= 0) board[i][j] = -99999999;
            }
        }
    }
}
