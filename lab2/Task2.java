package lab2;

import java.math.BigInteger;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int number_ = number.nextInt();
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        BigInteger newf = new BigInteger("0");
        for (int i = 1; i < number_; i++) {
            newf = first.add(second);
            first = second;
            second = newf;
        }
        System.out.println(newf.bitLength());
    }
}

