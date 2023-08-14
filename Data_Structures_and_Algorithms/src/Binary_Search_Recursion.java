import java.util.Scanner;

public class Binary_Search_Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        System.out.println(binary_search(array, 0, array.length - 1, target));

        scanner.close();

    }

    static int binary_search(int[] array, int start, int end, int target)
    {
        if (start > end)
        {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (array[mid] > target)
        {
            return binary_search(array, start, mid - 1, target);
        }
        else if (array[mid] < target)
        {
            return binary_search(array, mid + 1, end, target);
        }
        else
        {
            return mid;
        }
    }

}
