import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* for loop

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hardeep Bhatti");
        }

         */

        /*

        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

         */

        /* while loop

        int i = 1;

        while (i < 100)
        {
            System.out.println(i + i);
            i = i + i;
        }

         */

        /*

        int num = scanner.nextInt();

        int i = 1;

        while (i <= 10)
        {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }

         */

        /* do while

        int i = 3;

        do {
            System.out.println(i * i);
            i = i * i;
        } while (i < 100);
        
         */

        scanner.close();

    }

}
