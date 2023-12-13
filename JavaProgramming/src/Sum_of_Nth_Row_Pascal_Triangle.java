/* Program to Find the Sum of Nth row in Pascals Triangle

1               -           Sum = 2^0
1 1             -           Sum = 2^1
1 2 1           -           Sum = 2^2
1 3 3 1         -           Sum = 2^3
1 4 6 4 1       -           Sum = 2^4
1 5 10 10 5 1   -           Sum = 2^5
.....

 */

import java.util.Scanner;

public class Sum_of_Nth_Row_Pascal_Triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();

        System.out.println(1 << (row - 1));

        scanner.close();

    }

}