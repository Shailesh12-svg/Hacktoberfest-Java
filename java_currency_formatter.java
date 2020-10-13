import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Locale;
import java.text.NumberFormat;
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale india_locale=new Locale("en","IN");

        String us= NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india= NumberFormat.getCurrencyInstance(india_locale).format(payment);
        String china= NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france= NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
