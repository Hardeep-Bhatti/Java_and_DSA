public class Nth_Fibonacci_Number_Golden_Ratio {

    public static void main(String[] args) {

        for (int i = 0; i < 9; i++)
        {
            System.out.println(fibonacci(i) + " ");
        }

        System.out.println(fibonacci(50));

    }

    static int fibonacci(int n)
    {
        // return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));

        return (int) (1 / Math.sqrt(5) * (Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)));
    }

}
