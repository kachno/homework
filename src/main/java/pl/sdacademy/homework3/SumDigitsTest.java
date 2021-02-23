package pl.sdacademy.homework3;

import java.util.Scanner;

public class SumDigitsTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumDigits sd = new SumDigits();
        long number;
        long result;
        int count = 1;

        if (args.length == 0) {
            System.out.print("Podaj liczbę do zsumowania jej cyfr: ");
            number = scanner.nextLong();
            result = sd.sumOfDigits(number);
            System.out.printf("Suma cyfr liczby %d wynosi %d: \n", number, result);

            while (String.valueOf(result).length() > 1) {
                result = sd.sumOfDigits(result);
                count++;
            }
            System.out.printf("Po wykonaniu %dx metody sumOfChars() wynik wynosi %d: \n", count, result);
        } else {
            for (String arg : args) {
                result = sd.sumOfDigits(Long.parseLong(arg));
                System.out.printf("Suma cyfr liczby %d wynosi %d: \n", Long.parseLong(arg), result);
            }
        }
    }
}
