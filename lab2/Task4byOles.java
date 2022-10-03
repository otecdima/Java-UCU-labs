package lab2;

import java.util.Scanner;

public class Task4byOles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] result = new int[n][n];
        int[][] moves = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[] position = {0, 0};
        int currentMoveId = 0;
        for (int i = 0; i < n*n; i++) {
            int[] currentMove = moves[currentMoveId];
            int[] nextposition = {position[0]+currentMove[0], position[1]+currentMove[1]};
            if (0 <= nextposition[0] && nextposition[0] < n && nextposition[1] >= 0 && nextposition[1] <n && result[nextposition[0]][nextposition[1]] == 0) {
                result[nextposition[0]][nextposition[1]] = i;
                position[0] = nextposition[0];
                position[1] = nextposition[1];
            } else {
                currentMoveId = (currentMoveId+1) % moves.length;
                nextposition[0] = position[0] +currentMove[0];

            }
        }
    }
}
