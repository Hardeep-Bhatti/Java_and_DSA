// Program to find a unique element in an array which contains duplicate elements and one unique element.

public class Unique_Element {

    public static void main(String[] args) {

        int array[] = new int[]{2, 3, 5, 1, 1, 3, 4, 6, 6, 4, 2};

        System.out.println("Unique Element : " + find_unique_element(array));

    }

    static int find_unique_element(int[] array)
    {
        int uniqueElement = 0;

        for (int element : array)
        {
            uniqueElement = uniqueElement ^ element;
        }

        return uniqueElement;
    }

}