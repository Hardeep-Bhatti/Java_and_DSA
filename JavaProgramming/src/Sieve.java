import java.util.Scanner;

public class Sieve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        boolean[] primes = new boolean[num + 1];

        sieve(num, primes);

        for (int i = 0; i < primes.length; i++)
        {
            if (!primes[i])
            {
                System.out.println(i + " is a Prime Number");
            }
            else
            {
                System.out.println(i + " is Not a Prime Number");
            }
        }

        for (int i = 2; i <= num; i++)
        {
            if (!primes[i])
            {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    static void sieve(int num, boolean primes[])
    {
        primes[0] = primes[1] = true;

        for (int i = 2; i * i <= num; i++)
        {
            if (!primes[i])
            {
                for (int j = i * 2; j <= num; j = j + i)
                {
                    primes[j] = true;
                }
            }
        }
    }
}