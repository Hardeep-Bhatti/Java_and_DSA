import java.util.Scanner;

public class Binary_Search {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int []arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        System.out.println(binary_search(arr, target));

        scanner.close();

    }

    static int binary_search(int[] arr, int target)
    {
        int start = 0;

        int end = arr.length - 1;

        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }

        return -1;
    }
}