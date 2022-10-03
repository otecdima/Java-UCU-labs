package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner number_ = new Scanner(System.in);
        int number = number_.nextInt();
        int[][] twoD_arr = new int[number][number];
        int first = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                twoD_arr[i][j] = first;
                ++first;
            }
        }
        int[][] new_arr = new int[number][number];
        new_arr[0] = twoD_arr[0];
        int third = new_arr[0][number-1];
        int number_of_zones = (number+1)/2;
        for (int i = 0; i < number_of_zones; i++) {
            if (i > 0) {
                for (int j = i; j < number - i; j++) {
                    ++third;
                    new_arr[i][j] = third;
                }
            }
            for (int j = i + 1; j < number - i; j++) {
                ++third;
                new_arr[j][number-i-1] = third;
            }
            for (int j = i+1; j < number-i; j++) {
                ++third;
                new_arr[number-i-1][number-j-1] = third;
            }
            for (int j = i + 1; j < number-i-1; j++) {
                ++third;
                new_arr[number-j-1][i] = third;
            }
        }
        System.out.println(Arrays.deepToString(new_arr));
    }
}
