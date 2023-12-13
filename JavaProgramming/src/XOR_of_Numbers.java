// Program to Find XOR of Numbers from 0 to a.

import java.util.Scanner;

public class XOR_of_Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println("XOR of all numbers from 0 till " + a + " is : " + Find_XOR(a));

        scanner.close();

    }

    static int Find_XOR(int a)
    {
        int remainder = a % 4;

        switch (remainder)
        {
            case 0:
                return a;

            case 1:
                return 1;

            case 2:
                return a + 1;

            default:
                return 0;
        }
    }
}