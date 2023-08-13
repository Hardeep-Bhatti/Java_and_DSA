/*

import java.util.Scanner;

public class Order_Agnostic_Binary_Search {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int []arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int data = scanner.nextInt();

        if (arr[0] < arr[arr.length - 1])
        {
            System.out.println(binary_search_ascending_order(arr, data));
        }
        else if (arr[0] > arr[arr.length - 1])
        {
            System.out.println(binary_search_descending_order(arr, data));
        }
        else
        {
            System.out.println(0);
        }

        scanner.close();

    }

    static int binary_search_ascending_order(int[] arr, int data)
    {
        int low = 0;

        int high = arr.length - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            if (arr[mid] == data)
            {
                return mid;
            }
            else if (arr[mid] > data)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return -1;
    }

    static int binary_search_descending_order(int[] arr, int data)
    {
        int low = 0;

        int high = arr.length - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            if (arr[mid] == data)
            {
                return mid;
            }
            else if (arr[mid] > data)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return -1;
    }

}

 */

import java.util.Scanner;

public class Order_Agnostic_Binary_Search {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int []arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        System.out.println(order_agnostic_binary_search(arr, target));

        scanner.close();

    }

    static int order_agnostic_binary_search(int[] arr, int target)
    {
        int start = 0;

        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
            {
                return mid;
            }

            if (isAscending)
            {
                if (arr[mid] > target)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else
            {
                if (arr[mid] > target)
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

}
