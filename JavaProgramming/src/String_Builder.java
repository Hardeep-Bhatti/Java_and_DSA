public class String_Builder {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++)
        {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        System.out.println(builder);


        /* Constructors in StringBuilder class

        // 1 - StringBuilder()

        StringBuilder str1 = new StringBuilder();

        System.out.println(str1);    //  It would not print anything because initially the string is empty.

        System.out.println(str1.capacity());

        str1.append("Hardeep");

        System.out.println(str1);

        // 2 - StringBuilder(int capacity)

        StringBuilder str2 = new StringBuilder(15);

        System.out.println(str2.capacity());

        str2.append("HardeepBhattiStudent");

        System.out.println(str2);

        // 3 - StringBuilder(String str)

        StringBuilder str3 = new StringBuilder("HARDEEP");

        System.out.println(str3.capacity());

        System.out.println(str3);

        StringBuilder str4 = new StringBuilder(str3);

        System.out.println(str4.capacity());

        System.out.println(str4);

         */


        // Methods of StringBuilder Class

        // 1 - capacity()

        StringBuilder str1 = new StringBuilder();

        System.out.println(str1.capacity());

        // 2 - append(value)

        StringBuilder str2 = new StringBuilder();

        str2.append("Hardeep");

        System.out.println(str2);

        str2.append(56);

        System.out.println(str2);

        str2.append('z');

        System.out.println(str2);

        str2.append(5.6523f);

        System.out.println(str2);

        str2.append(5.65235641);

        System.out.println(str2);

        str2.append(true);

        System.out.println(str2);

        // 3 - insert(int offset, value)

        StringBuilder str3 = new StringBuilder("Hardeep");

        System.out.println(str3);

        str3.insert(3, "Bhatti");

        System.out.println(str3);

        str3.insert(0, 5);

        System.out.println(str3);

        str3.insert(9, 5.6531);

        System.out.println(str3);

        // 4 - replace(int startIndex, int endIndex, String s)

        StringBuilder str4 = new StringBuilder("Hardeep");

        str4.replace(0, 3, "deep");

        System.out.println(str4);

        str4.replace(0, 4, "Har");

        System.out.println(str4);

        // 5 - delete(int startIndex, int endIndex)

        StringBuilder str5 = new StringBuilder("Hardeep");

        str5.delete(0, 3);

        System.out.println(str5);

        // 6 - reverse()

        StringBuilder str6 = new StringBuilder("Hardeep");

        str6.reverse();

        System.out.println(str6);

        // 7 - length()

        StringBuilder str7 = new StringBuilder("Hardeep");

        System.out.println(str7.length());

        // 8 - substring(int startIndex)

        StringBuilder str8 = new StringBuilder("Hardeep");

        System.out.println(str8.substring(3));

        // 9 - substring(int startIndex, int endIndex)

        StringBuilder str9 = new StringBuilder("Hardeep");

        System.out.println(str8.substring(2, 6));

        // 10 - appendCodePoint(int codePoint)

        StringBuilder str10 = new StringBuilder("Hardeep");

        System.out.println("ASCII value of , is : " + (int)(','));

        str10.appendCodePoint(44);

        System.out.println(str10);

        str10.appendCodePoint(97);

        System.out.println(str10);

        // 11 - charAt(int index)

        StringBuilder str11 = new StringBuilder("Hardeep");

        System.out.println(str11.charAt(3));

        // 12 - codePointAt(int index)

        StringBuilder str12 = new StringBuilder("Hardeep");

        System.out.println(str12.codePointAt(3));

        // 13 - deleteCharAt(int index)

        StringBuilder str13 = new StringBuilder("Hardeep");

        str13.deleteCharAt(1);

        System.out.println(str13);

        // 14 - getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)

        StringBuilder str14 = new StringBuilder("Hardeep");

        System.out.println(str14);

        char[] array = new char[5];

        str14.getChars(3, 6, array, 0);

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // 15 - indexOf(String s)

        StringBuilder str15 = new StringBuilder("Hardeep");

        System.out.println(str15.indexOf("d"));

        System.out.println(str15.indexOf("ee"));

        System.out.println(str15.indexOf("Bh"));

        // 16 - lastIndexOf(String s)

        StringBuilder str16 = new StringBuilder("DeepDeep");

        System.out.println(str16.lastIndexOf("De"));

        // 17 - setCharAt(int index, char ch)

        StringBuilder str17 = new StringBuilder("Harzeep");

        System.out.println(str17);

        str17.setCharAt(3, 'd');

        System.out.println(str17);

    }
}