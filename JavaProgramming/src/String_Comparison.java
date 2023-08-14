public class String_Comparison {

    public static void main(String[] args) {

        // Check whether more than one reference variables are pointing to the same object or not.

        String a = "Hardeep";

        String b = "Hardeep";

        System.out.println(a == b);

        String c = new String("Hardeep");

        System.out.println(a == c);

        System.out.println(b == c);

        // Check whether two reference variables are string the same value or not.

        System.out.println(a.equals(c));

    }

}