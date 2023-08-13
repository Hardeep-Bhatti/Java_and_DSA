import java.util.Scanner;

import java.util.Arrays;

public class Cyclic_Sort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        cyclic_sort(array);

        System.out.println(Arrays.toString(array));

        scanner.close();

    }

    static void cyclic_sort(int[] array)
    {
        int i = 0;

        while (i < array.length)
        {
            int correct_index = array[i] - 1;

            if (correct_index > array.length || correct_index < 0)
            {
                i++;
                continue;
            }

            if (array[i] != array[correct_index])
            {
                int temp = array[i];
                array[i] = array[correct_index];
                array[correct_index] = temp;
            }
            else
            {
                i++;
            }
        }
    }

}