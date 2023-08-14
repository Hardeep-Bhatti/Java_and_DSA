import java.util.Arrays;

public class method_overloading {

    public static void main(String[] args) {

        print(55);

        print("Hardeep Bhatti");

        System.out.println(sum(51, 49));

        System.out.println(sum(55, 66, 100));

        print_arguments(5, 13, 99, 33, 55);

        print_arguments("Har", "deep", "Bhatti");

        //   print_arguments();    //   error

    }

    static void print(int num)
    {
        System.out.println(num);
    }

    static void print(String s)
    {
        System.out.println(s);
    }

    static int sum(int num1, int num2)
    {
        return num1 + num2;
    }

    static int sum(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }

    static void print_arguments(int ...variables)
    {
        System.out.println(Arrays.toString(variables));
    }

    static void print_arguments(String ...variables)
    {
        System.out.println(Arrays.toString(variables));
    }

}
