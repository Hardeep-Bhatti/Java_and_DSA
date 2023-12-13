// Program to Find Number of Digits in base b of a number.

import java.util.Scanner;

public class Number_of_Digits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int base = 10;

        int answer = (int)(Math.log(num) / Math.log(base)) + 1;

        System.out.println("Number of digits in decimal representation of " + num + " is : " + answer);

        base = 2;

        answer = (int)(Math.log(num) / Math.log(base)) + 1;

        System.out.println("Number of digits in binary representation of " + num + " is : " + answer);

        scanner.close();

    }

}