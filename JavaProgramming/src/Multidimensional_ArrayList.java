import java.util.Scanner;

import java.util.ArrayList;

public class Multidimensional_ArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialization

        for (int i = 0; i < 3; i++)
        {
            list.add(new ArrayList<>());
        }

        // Adding elements

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                list.get(i).add(scanner.nextInt());
            }
        }

        scanner.close();

    }

}
