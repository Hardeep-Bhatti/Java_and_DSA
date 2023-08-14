import java.util.Scanner;
public class switchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*

        String fruit = scanner.next();

        switch (fruit)
        {
            case "Mango":
                System.out.println("King of Fruits");
                break;

            case "Apple":
                System.out.println("Red Giant");
                break;

            case "Banana":
                for(int i = 0; i < 5; i++)
                {
                    System.out.println("Banana");
                }
                break;

            default:
                System.out.println("Fruits are Fruits");
        }

         */

        /* Enhanced Switch

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Red Giant");
            case "Banana" -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Banana");
                }
            }
            default -> System.out.println("Fruits are Fruits");
        }

         */

        /*

        int day = scanner.nextInt();

        switch (day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Work Day");
                break;
            case 6:
            case 7:
                System.out.println("Rest Day");
        }

         */

        /* Enhanced Switch

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Work Day");
            case 6, 7 -> System.out.println("Rest Day");
        }

         */

        /* Nested Switch

        String dept = scanner.next();

        int emp_id;

        switch (dept)
        {
            case "Teaching":
                emp_id = scanner.nextInt();
                switch (emp_id)
                {
                    case 1:
                        System.out.println("Today you have to teach \"Programming Fundamentals\"");
                        break;

                    case 2:
                        System.out.println("Today you have to teach \"8051 Microcontroller\"");
                        break;

                    default:
                        System.out.println("Please enter correct id");
                }
                break;

            case "Development":
                emp_id = scanner.nextInt();
                switch (emp_id)
                {
                    case 1:
                        System.out.println("Today you have to develop an android application");
                        break;

                    case 2:
                        System.out.println("Today you have to develop a C++ advanced project");
                        break;

                    default:
                        System.out.println("Please enter correct id");
                }
                break;

            default:
                System.out.println("Please enter correct department name");
        }

         */

        scanner.close();

    }
}
