package lab2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = compress(s);
        System.out.println(s);
        System.out.println(decompress(s));
    }

    public static String compress(String target) {
        String row = "";
        int counter = 1;
        for (int i = 0; i < target.length(); i++) {
            if (i == target.length() - 1) {
                if (counter != 1) {
                    row += String.valueOf(target.charAt(i)) + counter;
                } else {
                    row += String.valueOf(target.charAt(i));
                }
            } else {
                if (String.valueOf(target.charAt(i)).equals(String.valueOf(target.charAt(i + 1)))) {
                    ++counter;
                } else {
                    if (counter == 1) {
                        row += String.valueOf(target.charAt(i));
                    } else {
                        row += String.valueOf(target.charAt(i)) + counter;
                        counter = 1;
                    }
                }
            }
        }
        return row.trim();
    }

    public static String decompress(String target) {
        ArrayList<String> arr = new ArrayList<String>(9);
        for (int i = 0; i < 9; i++) {
            arr.add(String.valueOf(i));
        }
        String row = "";
        for (int i = 1; i < target.length(); i++) {
            if (i>1) {
                if (arr.contains(String.valueOf(target.charAt(i)))) {
                    for (int j = 0; j < Character.getNumericValue(target.charAt(i))-1; j++) {
                        row += String.valueOf(target.charAt(i - 1));
                    }
                } else {
                    row += String.valueOf(target.charAt(i));
                }
            }
            else if (arr.contains(String.valueOf(target.charAt(i)))) {
                for (int j = 0; j < Character.getNumericValue(target.charAt(i)); j++) {
                    row += String.valueOf(target.charAt(i - 1));
                }
            } else {
                if (i==1) {
                    row += String.valueOf(target.charAt(i-1));
                }
                row += String.valueOf(target.charAt(i));
            }
        }
        return row;
    }
}