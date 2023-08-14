import java.util.Scanner;

import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

        /*

        list.add(15);
        list.add(10);
        list.add(5);
        list.add(13);
        list.add(23);
        list.add(111);
        list.add(150);
        list.add(110);
        list.add(53);
        list.add(113);
        list.add(23333);
        list.add(1110);
        list.add(66);

        System.out.println(list);

        System.out.println(list.contains(53));

        list.set(0, 55);

        System.out.println(list);

        list.remove(5);

        System.out.println(list);

        System.out.println(list.get(9));

         */


        // ArrayList Input

        for (int i = 0; i < 5; i++)
        {
            list.add(scanner.nextInt());
        }


        // Output

        for (int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }

        for (int element : list)
        {
            System.out.println(element);
        }

        /* Assigning null to an ArrayList

        ArrayList<Integer> list1 = null;

        System.out.println(list1);

         */

    }

}