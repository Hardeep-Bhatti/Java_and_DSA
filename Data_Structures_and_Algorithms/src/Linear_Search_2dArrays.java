import java.util.Scanner;

import java.util.Arrays;

public class Linear_Search_2dArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();

        int columns = scanner.nextInt();

        int [][]arr = new int[rows][columns];

        for (int row = 0; row < arr.length; row++)
        {
            for (int cols = 0; cols < arr[row].length; cols++)
            {
                arr[row][cols] = scanner.nextInt();
            }
        }

        int element = scanner.nextInt();

        int result[] = linear_search(arr, element);

        System.out.println(Arrays.toString(result));

        scanner.close();

    }

    static int[] linear_search(int[][] arr, int element)
    {
        for (int row = 0; row < arr.length; row++)
        {
            for (int cols = 0; cols < arr[row].length; cols++)
            {
                if (arr[row][cols] == element)
                {
                    return new int[]{row, cols};
                }
            }
        }

        return new int[]{-1, -1};
    }

}
