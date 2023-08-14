import java.util.Arrays;

public class Arrays_Class_Methods {

    public static void main(String[] args) {

        // 1 - binarySearch(array, key)

        int[] array1 = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.binarySearch(array1, 5));

        char[] array2 = new char[]{'a', 'd', 'd', 'e', 'n'};

        System.out.println(Arrays.binarySearch(array2, 'n'));

        // 2 - binarySearch(array, fromIndex, toIndex, key)

        int[] array3 = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.binarySearch(array3, 2, 4, 4));

        char[] array4 = new char[]{'a', 'd', 'd', 'e', 'n'};

        System.out.println(Arrays.binarySearch(array4, 1, 4, 'e'));

        // 3 - compare(array1, array2)

        int[] array5 = new int[]{12, 45, 33, 90, 212};

        int[] array6 = new int[]{12, 45, 33, 90, 212};

        System.out.println(Arrays.compare(array5, array6));

        /*

        int[] array5 = new int[]{12, 45, 33, 90, 210};

        int[] array6 = new int[]{12, 45, 33, 90, 211};

        System.out.println(Arrays.compare(array5, array6));

         */

        /*

        int[] array5 = new int[]{12, 45, 33, 90, 215};

        int[] array6 = new int[]{12, 45, 33, 90, 211};

        System.out.println(Arrays.compare(array5, array6));

         */

        // 4 - compare(array1, array1fromIndex, array1toIndex, array2, array2fromIndex, array2toIndex)

        int[] array7 = new int[]{12, 45, 33, 90, 212};

        int[] array8 = new int[]{12, 45, 33, 90, 212};

        System.out.println(Arrays.compare(array7, 1, 3, array8, 1, 3));

        // 5 - toString(array)

        int[] array9 = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array9));

        // 6 - copyOf(originalArray, newLength)

        int[] array10 = {13, 56, 32, 466, 43, 4566};

        int[] array11 = Arrays.copyOf(array10, 4);

        System.out.println(Arrays.toString(array10));

        System.out.println(Arrays.toString(array11));

        // 7 - copyOfRange(originalArray, fromIndex, toIndex)

        int[] array12 = {13, 56, 52, 4321, 43, 545, 321};

        int[] array13 = Arrays.copyOfRange(array12, 2, 6);

        System.out.println(Arrays.toString(array12));

        System.out.println(Arrays.toString(array13));

        // 8 - deepEquals(Object[] a1, Object[] a2)    -     2d Arrays

        // int[][] array14 = {{13, 56, 52, 4321, 43, 545, 321}};

        // int[][] array15 = {{13, 56, 52, 4321, 43, 545, 321}};

        // System.out.println(Arrays.deepEquals(array14, array15));

        // 9 - deepToString(Object[] a)

        int[][] array16 = new int[][]{{1, 2, 3, 4, 5}};

        System.out.println(Arrays.deepToString(array16));

        // 10 - equals(array1, array2)

        int[] array17 = new int[]{12, 56, 21, 90, 1};

        int[] array18 = new int[]{12, 56, 21, 90, 1};

        System.out.println(Arrays.equals(array17, array18));

        // 11 - equals(array1, array1FromIndex, array1ToIndex, array2, array2FromIndex, array2ToIndex)

        int[] array19 = new int[]{12, 56, 21, 90, 1};

        int[] array20 = new int[]{12, 56, 21, 90, 1};

        System.out.println(Arrays.equals(array19, 2, 4, array20, 2, 4));

        // 12- fill(originalArray, fillValue)

        int[] array21 = new int[]{1, 2, 3, 4, 6};

        Arrays.fill(array21, 5);

        System.out.println(Arrays.toString(array21));

        // 13 - mismatch(array1, array2)

        int[] array22 = new int[]{5, 13, 21, 55, 321, 56};

        int[] array23 = new int[]{5, 13, 21, 34, 21, 56};

        System.out.println(Arrays.mismatch(array22, array23));

        // 14 - parallelSort(originalArray)

        int[] array24 = new int[]{13, 34, 321, 576, 45, 31, 5};

        Arrays.parallelSort(array24);

        System.out.println(Arrays.toString(array24));

        // 15 - sort(originalArray)

        int[] array25 = new int[]{13, 34, 321, 576, 45, 31, 5};

        Arrays.sort(array25);

        System.out.println(Arrays.toString(array25));

        // 16 - sort(originalArray, fromIndex, toIndex)

        int[] array26 = new int[]{13, 34, 321, 576, 45, 31, 5};

        Arrays.sort(array26, 2, 5);

        System.out.println(Arrays.toString(array26));

    }

}
