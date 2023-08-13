import java.util.Scanner;

import java.util.Arrays;

public class Insertion_Sort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        insertion_sort_ascending_order(array);

        System.out.println(Arrays.toString(array));

        insertion_sort_descending_order(array);

        System.out.println(Arrays.toString(array));

        scanner.close();

    }

    // Ascending Order

    static void insertion_sort_ascending_order(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i + 1; j > 0; j--)
            {
                if (array[j] < array[j - 1])
                {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }

    // Descending Order

    static void insertion_sort_descending_order(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i + 1; j > 0; j--)
            {
                if (array[j] > array[j - 1])
                {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }

}
