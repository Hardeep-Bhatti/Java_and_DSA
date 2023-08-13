import java.util.Scanner;

public class Linear_Search {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int element = scanner.nextInt();

        System.out.println(linear_search(arr, element));


        /*

        scanner.nextLine();

        String str = scanner.nextLine();

        char ch = scanner.next().charAt(0);

        if (linear_search(str, ch))
        {
            System.out.println("Character " + ch + " exists in the string " + str);
        }
        else
        {
            System.out.println("Character " + ch + " does not exist in the string " + str);
        }

         */


        /* toCharArray() method

        String name = "Hardeep";

        System.out.println(Arrays.toString(name.toCharArray()));

         */


        scanner.close();

    }

    static int linear_search(int[] arr, int element)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == element)
            {
                return i;
            }
        }

        return -1;
    }


    /*

    static boolean linear_search(String str, char ch)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch)
            {
                return true;
            }
        }

        return false;
    }

     */


    /*

    static boolean linear_search(String str, char ch)
    {
        for (char element : str.toCharArray())
        {
            if (element == ch)
            {
                return true;
            }
        }

        return false;
    }

     */


}