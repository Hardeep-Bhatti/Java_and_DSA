import java.util.Scanner;

import java.util.Arrays;

public class Multidimensional_Arrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* declaration

        int[][] arr1 = new int[3][3];

        int [][]arr2 = new int[3][3];

        int arr3[][] = new int[3][3];

        int[] arr4[] = new int[3][3];

        int []arr5[] = new int[3][3];

         */


        /* Array Literal

        int[][] arr = {
                      {1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}
                      };

        int [][]arr1 = {
                       {1, 2, 3, 4, 5},
                       {6, 7},
                       {8, 9, 10}
                       };

         */


        /* 2d Array Input

        int[][] arr = new int[3][3];

        for (int rows = 0; rows < arr.length; rows++)
        {
            for (int cols = 0; cols < arr[rows].length; cols++)
            {
                arr[rows][cols] = scanner.nextInt();
            }
        }

         */


        /* Output

        for (int rows = 0; rows < arr.length; rows++)
        {
            for (int cols = 0; cols < arr[rows].length; cols++)
            {
                System.out.print(arr[rows][cols] + " ");
            }

            System.out.println();
        }

        for (int rows = 0; rows < arr.length; rows++)
        {
            System.out.println(Arrays.toString(arr[rows]));
        }

        for (int[] ele : arr)
        {
            System.out.println(Arrays.toString(ele));
        }

         */


        /*

        int arr[][] = {
                      {1, 2, 3, 4, 5},
                      {6, 7},
                      {8, 9, 10}
                      };

        for (int rows = 0; rows < arr.length; rows++)
        {
            for (int cols = 0; cols < arr[rows].length; cols++)
            {
                System.out.print(arr[rows][cols] + " ");
            }

            System.out.println();
        }

        for (int rows = 0; rows < arr.length; rows++)
        {
            System.out.println(Arrays.toString(arr[rows]));
        }

         */

        /*

        int[][] arr = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] array : arr)
        {
            for (int element : array)
            {
                System.out.print(element + " ");
            }

            System.out.println();
        }

         */

    }

}