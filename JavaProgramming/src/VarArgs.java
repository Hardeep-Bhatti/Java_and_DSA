import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {

        example(5, 10, 3, 5, 6, 13, 55);

        examples(5, 55, 6, 3, 12, 66, 19);

    }

    static void example(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }


    static void examples(int num1, int num2, int ...z)
    {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(Arrays.toString(z));
    }

}
