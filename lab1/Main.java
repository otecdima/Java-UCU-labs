package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numbers_ = new Scanner(System.in);
        int[] numbers_list = new int[numbers_.nextInt()];
        for (int i = 0; i < numbers_list.length; i++) {
            numbers_list[i] = numbers_.nextInt();
        }
        int sum_ = 0;
        int product = 1;
        for (int j : numbers_list) {
            sum_ += j;
            product *= j;
        }
        int max_ = 0;
        int min_ = numbers_list[0];
        for (int j : numbers_list) {
            if (j > max_) {
                max_ = j;
            }
            if (j < min_) {
                min_ = j;
            }
        }
        double average = (double) sum_ / numbers_list.length;
        String finale = "";
        if (average % 1 == 0) {
            int averag = (int)average;
            finale = Integer.toString(max_) + " " +
                    Integer.toString(min_) + " " +
                    Integer.toString(averag) +
                    " " + Integer.toString(sum_) + " " + Integer.toString(product);
        }
        else {
            finale = Integer.toString(max_) + " " +
                    Integer.toString(min_) + " " +
                    String.format("%.2f", average) +
                    " " + Integer.toString(sum_) + " " + Integer.toString(product);
        }

        System.out.println(finale);
    }
}
