import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (isPrime(num))
        {
            System.out.println(num + " is a Prime Number");
        }
        else
        {
            System.out.println(num + " is Not a Prime Number");
        }

        scanner.close();

    }

    static boolean isPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }

        int c = 2;

        while (c * c <= num)
        {
            if (num % c == 0)
            {
                return false;
            }

            c++;
        }

        return true;
    }

}