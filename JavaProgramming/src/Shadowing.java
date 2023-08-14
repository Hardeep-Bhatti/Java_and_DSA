public class Shadowing {

    static int x = 12;    //  class variable   -    This will be shadowed at line 7.

    public static void main(String[] args) {

        System.out.println(x);

        int x = 33;

        System.out.println(x);

        printing();

    }

    static void printing()
    {
        System.out.println(x);
    }

}