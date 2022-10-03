package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] arr = new int[number][];
        int counter_1 = 1;
        for (int i = 0; i < number; i++) {
            arr[i] = new int[i+1];
        }
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < i+1; j++) {
                    arr[i][j] = counter_1;
                    ++counter_1;
                }
            } else {
                for (int j = i; j >= 0; j--) {
                    arr[i][j] = counter_1;
                    ++counter_1;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}