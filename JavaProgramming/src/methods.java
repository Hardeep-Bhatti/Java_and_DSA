import java.util.Scanner;

public class methods {

    public static void main(String[] args) {

        /* Calling/invoking a static method

        sum();

         */


        /* Calling/invoking an Instance method

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        methods obj = new methods();

        obj.sum(num1, num2);

        scanner.close();

         */


        /* returning the value

        int result = sum();

        System.out.println(result);

         */

    }

    /* Static Method

    static void sum()
    {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 + num2);

        scanner.close();
    }

     */


    /* Instance Method

    void sum(int num1, int num2)
    {
        System.out.println(num1 + num2);
    }

     */


    /* returning the value

    static int sum()
    {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum =  num1 + num2;

        return sum;
    }

     */

}
