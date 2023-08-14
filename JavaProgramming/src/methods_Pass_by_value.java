public class methods_Pass_by_value {

    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 50;

        swap(num1, num2);

        System.out.println(num1 + " " + num2);


        String name = "Hardeep";
        change_name(name);
        System.out.println(name);
    }

    static void swap(int num1, int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }


    static void change_name(String new_name)
    {
        new_name = "Bhatti";
    }

}
