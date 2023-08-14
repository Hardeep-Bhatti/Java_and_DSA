import java.util.Scanner;

public class TypeConversion_and_TypeCasting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* Type Conversion - Automatic type conversion

        float var1 = 55;

        System.out.println(var1);

        double var2 = 565.356f;

        System.out.println(var2);

        float var3 = scanner.nextInt();

        System.out.println(var3);

        float var4 = scanner.nextFloat();  // Using nextFloat() method but providing an integer as input in the console.

        System.out.println(var4);

         */

        /* Type Casting

        int var5 = (int) (56.565f);

        System.out.println(var5);

        float var6 = (float) (scanner.nextDouble());

        System.out.println(var6);

        int var7 = (int) (scanner.nextFloat());

        System.out.println(var7);

        int var8 = 300;

        byte var9 = (byte) (var8);

        System.out.println(var9);

         */

        /* Automatic Type Promotions in expressions

        byte var10 = 50;
        byte var11 = 50;
        byte var12 = 100;
        int var13 = (var10 * var11) / var12;

        System.out.println(var13);

         */

        System.out.println("नमसतए");

        /* Type Promotions

        System.out.println(5 * 56.5321);

        byte var14 = 51;
        char var15 = 'H';
        short var16 = 5233;
        int var17 = 563473;
        float var18 = 645.4564f;
        double var19 = 656745.654654;

        double result = (var18 / var14) * (var17 / var15) - (var19 - var16);

        System.out.println((var18 / var14) + " " + (var17 / var15) + " " + (var19 - var16));

        System.out.println(result);

         */

    }

}
