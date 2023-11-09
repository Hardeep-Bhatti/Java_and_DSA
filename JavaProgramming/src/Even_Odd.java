import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (isOdd(num))
        {
            System.out.println(num + " is odd");
        }
        else
        {
            System.out.println(num + " is even");
        }

        scanner.close();

    }

    static boolean isOdd(int num)
    {
        return ((num & 1) == 1);
    }

}