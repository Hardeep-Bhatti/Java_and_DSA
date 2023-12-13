// Program to Find Number of Set Bits in a given number i.e. Number of Bits that are 1.

import java.util.Scanner;

public class Number_of_Set_Bits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println("Binary Representation of " + num + " is : " + Integer.toBinaryString(num));

        System.out.println("Number of Set Bits in number " + num + " is : " + number_of_set_bits(num));

        scanner.close();

    }

    static int number_of_set_bits(int num)
    {
        int count = 0;

        while (num > 0)
        {
            // num = num - (num & -num);

           num = num & (num - 1);

            count++;
        }

        return count;
    }

}
