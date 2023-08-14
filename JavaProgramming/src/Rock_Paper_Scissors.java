import java.util.Scanner;

import java.util.Random;

public class Rock_Paper_Scissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String playAgain = null;

        do
        {
            String playerMove = null;

            while (true)
            {
                System.out.println("Enter your move (r, p, or s)");

                playerMove = scanner.nextLine();

                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))
                {
                    break;
                }

                System.out.println("Invalid Move!");
            }

            System.out.println("Player's move : " + playerMove);

            String[] moves = {"r", "p", "s"};

            String computerMove = moves[new Random().nextInt(moves.length)];

            System.out.println("Computer's move : " + computerMove);

            if (playerMove.equals(computerMove))
            {
                System.out.println("Tie Game!");
            }
            else
            {
                switch (playerMove)
                {
                    case "r":

                        switch (computerMove)
                        {
                            case "p":
                                System.out.println("You lose!");
                                break;

                            case "s":
                                System.out.println("You win!");
                                break;
                        }

                        break;

                    case "p":

                        switch (computerMove)
                        {
                            case "r":
                                System.out.println("You win!");
                                break;

                            case "s":
                                System.out.println("You lose!");
                                break;
                        }

                        break;

                    case "s":

                        switch (computerMove)
                        {
                            case "r":
                                System.out.println("You lose!");
                                break;

                            case "p":
                                System.out.println("You win");
                                break;
                        }

                        break;
                }
            }

            System.out.println("Do you want to play again? (press y to play again or anything else to exit)");

            playAgain = scanner.nextLine();

        }while (playAgain.equals("y"));

        scanner.close();

    }

}
