// Program to calculate a raise to power b.

import java.util.Scanner;

public class a_raise_to_power_b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        System.out.println(a + "^" + b + " = " + calculation(a, b));

        scanner.close();

    }

    static long calculation(int a, int b)
    {
        long answer = 1;

        long base = a;

        while (b > 0)
        {
            if ((b & 1) == 1)
            {
                answer = answer * base;
            }

            base = base * base;

            b >>= 1;
        }

        return answer;
    }

}
