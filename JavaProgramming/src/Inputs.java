import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(input.nextByte());

        System.out.println(input.nextShort());

        System.out.println(input.nextInt());

        System.out.println(input.nextLong());

        System.out.println(input.nextFloat());

        System.out.println(input.nextDouble());

        System.out.println(input.nextBoolean());

        System.out.println(input.next().charAt(0));

        System.out.println(input.next());

        input.nextLine();

        System.out.println(input.nextLine());

        /* int

        System.out.print("Enter your roll number : ");

        int roll_no = input.nextInt();

        System.out.println("Your roll number is " + roll_no);

        int amount = 123_000_000;

        System.out.println(amount);

         */

        /* long

        System.out.print("Enter Your Contact Number : ");

        long contact_no;

        contact_no = input.nextLong();

        System.out.println("Your contact number is " + contact_no);

         */

        /* String

        input.nextLine();

        System.out.print("Enter your Name : ");

        String name = input.nextLine();

        System.out.println("Your name is " + name);

        System.out.print("Enter Your First Name : ");

        String first_name = input.next();

        System.out.println("Your first name is " + first_name);

         */

        /* float

        System.out.print("Enter the Amount you currently have with you : ");

        float curr_amount;

        curr_amount = input.nextFloat();

        System.out.println("You currently have " + curr_amount + " rupees with you");

         */

        /* double

        System.out.print("Enter the Amount you have in your Bank Account : ");

        double acc_amount = input.nextDouble();

        System.out.println("Your Bank Account has the amount of " + acc_amount + " rupees");

         */

        /* boolean

        System.out.print("Are you a Student : ");

        boolean is_student = input.nextBoolean();

        System.out.println("You have entered " + is_student);

         */

        /* char

        System.out.print("Enter your Favourite character : ");

        char fav_char = input.next().charAt(2);

        System.out.println("Your favourite character is " + fav_char);

         */

        input.close();

    }

}
