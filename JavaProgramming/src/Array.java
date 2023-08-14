import java.util.Arrays;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        /*

        int[] roll_no = new int[5];

        int roll_nos[] = {1, 15, 3, 13, 30};

        System.out.println(roll_no);

        System.out.println(roll_nos);

        int arr[] = new int[5];

        System.out.println(arr[3]);

        String []name = new String[5];

        System.out.println(name[2]);

        String s = null;

        System.out.println(s);

         */


        /* Array Input    -     Array of Primitives

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 13;
        arr[2] = 55;
        arr[3] = 90;
        arr[4] = 12;

        System.out.println(arr[3]);

        // Input using for loop

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        // Array Output

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        for (int num : arr)     //  for every element in array, print the element
        {
            System.out.print(num + " ");   //  here num represents element of the array
        }

        System.out.println(Arrays.toString(arr));

         */


        /* Array of objects

        Scanner scanner = new Scanner(System.in);

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++)
        {
            str[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(str));

         */

        /* Another way to Initialize an Array in one line with the basic syntax

        int[] roll_no = {1, 15, 3, 13, 30};

        System.out.println(Arrays.toString(roll_no));

         */

        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));

    }

}
