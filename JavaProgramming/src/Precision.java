/*

import java.text.DecimalFormat;

public class Precision {

    public static void main(String[] args) {

        double num = 563.5631967;

        DecimalFormat df = new DecimalFormat("#.##");

        String formatted_value = df.format(num);

        System.out.println("Original Value : " + num);

        System.out.println("Formatted Value : " + formatted_value);

    }

}

 */

/*

public class Precision {

    public static void main(String[] args) {

        double num = 563.5631967961;

        int precision = 3;

        String formatted_value = String.format("%." + precision + "f", num);

        System.out.println("Original Value : " + num);

        System.out.println("Formatted Value : " + formatted_value);

    }

}

 */

import java.math.BigDecimal;

public class Precision {

    public static void main(String[] args) {

        double num = 431.575645446;

        int precision = 4;

        BigDecimal bd = new BigDecimal(num);

        bd = bd.setScale(precision, BigDecimal.ROUND_HALF_UP);

        double formatted_value = bd.doubleValue();

        System.out.println("Original Value : " + num);

        System.out.println("Formatted Value : " + formatted_value);

    }

}