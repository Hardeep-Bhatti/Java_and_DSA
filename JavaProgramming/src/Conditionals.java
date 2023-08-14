import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        if (true)
        {
            System.out.println("The condition is evaluating to true");
        }

        Scanner scanner = new Scanner(System.in);

        double percentage;

        percentage = scanner.nextDouble();

        if (percentage <= 30.56)
        {
            System.out.println("Man you are on the edge");
        }
        else if (percentage <= 50.23)
        {
            System.out.println("That now something to talk about");
        }
        else if (percentage <= 75.676)
        {
            System.out.println("Man show your potential to the life");
        }
        else
        {
            System.out.println("You are riding the future");
        }

        scanner.close();

    }

}
