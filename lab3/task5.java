package lab3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] temp;
        temp = sentence.split(" ");
        StringBuilder new_str = new StringBuilder();
        for (String item: temp) {
            String reverse = new StringBuffer(item).reverse().toString();
            new_str.append(reverse).append(" ");
        }
        System.out.println(new_str);
    }
}
