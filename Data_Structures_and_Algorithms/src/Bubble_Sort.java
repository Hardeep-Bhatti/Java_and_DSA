import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        bubble_sort(array);

        for (int element : array)
        {
            System.out.print(element + " ");
        }

        scanner.close();

    }

    static void bubble_sort(int[] array)
    {
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++)
        {
            swapped = false;

            for (int j = 1; j < array.length - i; j++)   // or we can do j <= array.length -i - 1
            {
                if (array[j] < array[j - 1])
                {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
            {
                break;
            }
        }
    }

}