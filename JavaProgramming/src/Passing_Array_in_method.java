import java.util.Arrays;

import java.util.Scanner;

public class Passing_Array_in_method {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int []arr = new int[5];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        change(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] arr)
    {
        arr[0] = 15;
        arr[3] = 55;
    }

}
