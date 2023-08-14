import java.util.ArrayList;

public class PrettyPrinting {

    public static void main(String[] args) {

        float f = 12.3569f;

        System.out.printf("Formatted Number is : %.2f", f);

        System.out.println();

        System.out.println(Math.PI);

        System.out.printf("Pie : %.6f", Math.PI);

        System.out.println();

        // Format Specifiers

        System.out.printf("Inserting a percent sign : %%");

        System.out.println();

        System.out.printf("Inserting an Integer hexadecimal : %x", 10);

        System.out.println();

        System.out.printf("Inserting an Integer hexadecimal : %X", 15);

        System.out.println();

        System.out.printf("Inserting a string : %s", "hardeep");  // Can also use capital letter string here

        System.out.println();

        System.out.printf("Inserting a string : %S", "hardeep");

        System.out.println();

        System.out.printf("Inserting a new line character here. %n");

        System.out.printf("Inserting an octal integer : %o", 56);

        System.out.println();

        System.out.printf("Inserting a decimal floating point : %f", 156.32156);

        System.out.println();

        System.out.printf("Scientific Notation : %e", 1456.455335);

        System.out.println();

        System.out.printf("Scientific Notation : %E", 1456.455335);

        System.out.println();

        System.out.printf("Hash code of the argument : %h", 1456.13);

        System.out.println();

        System.out.printf("Hash code of the argument : %H", 55);

        System.out.println();

        System.out.printf("Decimal Integer : %d", 14565445);

        System.out.println();

        System.out.printf("Character : %c", 'z');

        System.out.println();

        System.out.printf("Boolean : %b", true);

        System.out.println();

        System.out.printf("Boolean : %B", false);

        System.out.println();

        System.out.printf("Floating-point hexadecimal : %a", 14565445.33);

        System.out.println();

        System.out.printf("Floating-point hexadecimal : %A", 1456.33);

        System.out.println();

        // String Concatenation Operator

        System.out.println('a' + 'b');

        System.out.println("Hardeep" + "Bhatti");

        System.out.println('a' + 3);

        System.out.println("H" + 1);

        System.out.println("Hardeep" + new ArrayList<>());

        // System.out.println(new ArrayList<>() + new ArrayList<>());      -       error

        System.out.println(new ArrayList<>() + "" + new ArrayList<>());

        // String Performance

        String series = "";

        for (int i = 0; i < 26; i++)
        {
            char ch = (char) ('a' + i);
            series = series + ch;
        }

        System.out.println(series);

    }

}
