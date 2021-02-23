package pl.sdacademy.homework1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MilesToKilometersTest {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        String miles;
        double result;
        MilesToKilometers mtk = new MilesToKilometers();

        if (args.length == 0) {
            do {
                final Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj dodatnią wartość w milach do przeliczenia na kilometry: ");
                miles = scanner.next();
            } while (!Pattern.matches("^\\d+(\\.\\d+)?$", miles));
            result = mtk.calculateMilesToKilometers(Double.parseDouble(miles));
            System.out.printf("%.2f mi \u2248 %.2f km", Double.parseDouble(miles), result);
        } else {
            for (String arg : args) {
                result = mtk.calculateMilesToKilometers(Double.parseDouble(arg));
                System.out.printf("%.2f mi \u2248 %.2f km\n", Double.parseDouble(arg), result);
            }
        }
    }
}
