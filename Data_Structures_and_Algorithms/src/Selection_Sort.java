import java.util.Scanner;

import java.util.Arrays;

public class Selection_Sort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        selection_sort(array);

        System.out.println(Arrays.toString(array));

        scanner.close();

    }

    /* Selecting the maximum element

    static void selection_sort(int[] array)
    {
        int k = 0;

        for (int i = array.length - 1; i > 0; i--)
        {
            int max_value = Integer.MIN_VALUE;

            int max_value_index = 0;

            for (int j = 0; j < array.length - k; j++)
            {
                if (array[j] > max_value)
                {
                    max_value = array[j];
                    max_value_index = j;
                }
            }

            k++;

            int temp = array[i];
            array[i] = array[max_value_index];
            array[max_value_index] = temp;
        }
    }

     */

    // Selecting the minimum element

    static void selection_sort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int min = Integer.MAX_VALUE;

            int min_index = 0;

            for (int j = i; j < array.length; j++)
            {
                if (array[j] < min)
                {
                    min = array[j];
                    min_index = j;
                }
            }

            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
    }

}