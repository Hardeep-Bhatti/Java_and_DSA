import java.util.Arrays;

public class String_methods {

    public static void main(String[] args) {

        // 1 - charAt(int index)

        String str1 = "Hardeep";

        System.out.println(str1.charAt(3));

        // 2 - length()

        String str2 = "Hardeep Bhatti";

        System.out.println(str2.length());

        // 3 - substring(int beginIndex)

        String str3 = "Hardeep";

        System.out.println(str3.substring(3));

        // 4 - substring(int beginIndex, int endIndex)

        String str4 = "Hardeep";

        System.out.println(str4.substring(1, 5));

        // 5 - contains(charSequence s)

        String str5 = "Hardeep";

        System.out.println(str5.contains("deep"));

        System.out.println(str5.contains("Bhatti"));

        // 6 - concat(String s)

        String str6 = "Hardeep";

        System.out.println(str6);

        System.out.println(str6.concat(" Bhatti"));

        System.out.println(str6);

        // 7 - toCharArray

        String str7 = "Hardeep Bhatti";

        System.out.println(Arrays.toString(str7.toCharArray()));

        char[] strArray = str7.toCharArray();

        System.out.println(Arrays.toString(strArray));

        // 8 - equals()

        String str8 = "Hardeep";

        System.out.println(str8.equals("Hardeep"));

        // 9 - isEmpty()

        String str9 = "Hardeep";

        System.out.println(str9.isEmpty());

        // 10 - replace(char oldChar, char newChar)

        String str10 = "Hardiip";

        System.out.println(str10.replace('i', 'e'));

        System.out.println(str10);

        // 11 - replace(CharSequence target, CharSequence replacement)

        String str11 = "HarHar";

        System.out.println(str11.replace("Har", "deep"));

        System.out.println(str11);

        // 12 - equalsIgnoreCase(String anotherString)

        String str12 = "hardeep";

        System.out.println(str12.equals("HARDEEP"));

        System.out.println(str12.equalsIgnoreCase("HARDEEP"));

        System.out.println(str12.equalsIgnoreCase("HaRdEEp"));

        // 13 - split(String regex)

        String str13 = "Hardeep Bhatti Student";

        System.out.println(Arrays.toString(str13.split(" ")));

        System.out.println(Arrays.toString(str13.split("a")));

        // 14 - split()

        String str14 = "Hardeep Bhatti Student";

        System.out.println(Arrays.toString(str14.split(" ", 1)));

        System.out.println(Arrays.toString(str13.split("a", 2)));

        // 15 - indexOf(int ch)

        String str15 = "Hardeep Bhatti";

        System.out.println(str15.indexOf('i'));

        // 16 - indexOf(int ch, int fromIndex)

        String str16 = "Hardeep Bhatti";

        System.out.println(str16.indexOf('t', 3));

        System.out.println(str16.indexOf('e', 4));

        // 17 - indexOf(String str)

        String str17 = "Hardeep Bhatti";

        System.out.println(str17.indexOf("Bha"));

        // 18 - indexOf(String str, int fromIndex)

        String str18 = "deep deep deep";

        System.out.println(str18.indexOf("ep", 5));

        // 19 - lastIndexOf(int ch)

        String str19 = "Hardeep Bhatti";

        System.out.println(str19.lastIndexOf('t'));

        // 20 - lastIndexOf(int ch, int fromIndex)

        String str20 = "Hardeep Bhatti";

        System.out.println(str20.lastIndexOf('e', 7));

        System.out.println(str20.lastIndexOf('a', 12));

        // 21 - lastIndexOf(String str)

        String str21 = "deep deep deep";

        System.out.println(str21.lastIndexOf("de"));

        // 22 - lastIndexOf(String str, int fromIndex)

        String str22 = "deep deep deep";

        System.out.println(str22.lastIndexOf("de", 6));

        // 23 - toLowerCase()

        String name = "HARDEEP BHATTI";

        System.out.println(name.toLowerCase());

        System.out.println(name);

        // 24 - toUpperCase()

        String full_name = "hardeep bhatti";

        System.out.println(full_name.toUpperCase());

        // 25 - trim()

        String str25 = "     Hardeep       ";

        System.out.println(str25);

        System.out.println(str25.trim());

        // 26 - join(CharSequence delimiter, CharSequence... elements)

        String str26 = "Hardeep";

        String str27 = "Bhatti";

        String str28 = "Student";

        String str29 = String.join(" ", str26, str27, str28);

        System.out.println(str29);

        System.out.println(String.join("-", "Student", "Studying" ));

        // 27 - getBytes()

        String str30 = "Hardeep";

        byte[] str30_array = str30.getBytes();

        System.out.println(Arrays.toString(str30_array));

        // 28 - startsWith()

        String str31 = "Hardeep Bhatti";

        System.out.println(str31.startsWith("Har"));

        System.out.println(str31.startsWith("har"));

        // 29 - endsWith()

        String str32 = "Hardeep Bhatti";

        System.out.println(str32.endsWith("atti"));

        System.out.println(str32.endsWith("TI"));

        // 30 - repeat(int count)

        String str33 = "Hardeep";

        System.out.println(str33.repeat(10));
        
    }

}
