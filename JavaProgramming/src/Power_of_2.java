// Program to Find if a number is power of 2.

import java.util.Scanner;

public class Power_of_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num == 0)
        {
            System.out.println(num + " is not a power of 2");
            return;
        }

        if (isPowerof2(num))
        {
            System.out.println(num + " is a power of 2");
        }
        else
        {
            System.out.println(num + " is not a power of 2");
        }

        scanner.close();

    }

    static boolean isPowerof2(int num)
    {
        return ((num & (num - 1)) == 0);
    }

}
