import java.util.ArrayList;

import java.util.Comparator;

import java.util.ListIterator;

public class ArrayList_methods {

    public static void main(String[]args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(55);
        list.add(3);
        list.add(105);
        list.add(66);
        list.add(33);
        list.add(13);

        System.out.println(list);

        /* sort()

        list.sort(Comparator.naturalOrder());

        System.out.println(list);

        list.sort(Comparator.reverseOrder());

        System.out.println(list);

         */

        /* size()

        System.out.println(list.size());

         */

        /* clone()

        ArrayList<Integer> copy = (ArrayList<Integer>)list.clone();

        System.out.println(copy);

        // or

        System.out.println(list.clone());

         */

        /* contains()

        System.out.println(list.contains(55));

         */

        /* isEmpty()

        System.out.println(list.isEmpty());

         */

        /* indexOf()

        System.out.println(list.indexOf(105));

        System.out.println(list.indexOf(355));

         */

        /* lastIndexOf()

        System.out.println(list.lastIndexOf(33));

        System.out.println(list.lastIndexOf(25));

         */

        /* get()

        System.out.println(list.get(5));

         */

        /* clear()

        list.clear();

        System.out.println(list);

         */

        /* add(Object)   and    add(index, Object)

        list.add(333);

        list.add(7, 555);

        System.out.println(list);

         */

        /* addAll(Collection C)

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(233);
        list1.add(663);
        list1.add(1);
        list1.add(22);
        list1.add(99);

        System.out.println(list1);

        list1.addAll(list);

        System.out.println(list1);

         */

        /* addAll(index, Collection)

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(233);
        list1.add(663);
        list1.add(1);
        list1.add(22);
        list1.add(99);

        System.out.println(list1);

        list1.addAll(2, list);

        System.out.println(list1);

         */

        /* listIterator()

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

         */

        /* listIterator(int index)

        ListIterator<Integer> iterator = list.listIterator(3);

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

         */

        /* remove(int index)

        list.remove(4);

        System.out.println(list);

        System.out.println(list.remove(5));

        System.out.println(list);

         */

        /* removeAll(Collection C)

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(55);
        list1.add(3);
        list1.add(105);
        list1.add(66);
        list1.add(33);
        list1.add(13);

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(55);
        list2.add(3);
        list2.add(105);

        System.out.println(list2);

        list1.removeAll(list2);

        System.out.println(list1);

         */

        /* removeIf(Predicate Filter)

        list.removeIf(n -> (n % 3 == 0));

        System.out.println(list);

         */

        /* retainAll(Collection C)

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(55);
        list1.add(3);
        list1.add(105);
        list1.add(66);
        list1.add(33);
        list1.add(13);

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(55);
        list2.add(3);
        list2.add(105);

        System.out.println(list2);

        list1.retainAll(list2);

        System.out.println(list1);

         */

        /* set(int index, Element)

        list.set(3, 99);

        System.out.println(list);

         */

        /* subList(fromIndex, toIndex)

        System.out.println(list.subList(2, 5));

         */

    }

}
