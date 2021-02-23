package pl.sdacademy.homework3;

public class SumDigits {

    private long firstNumber;
    private long sum;

    public long sumOfDigits(long number) {
        sum = 0;
        while (number > 0) {
            firstNumber = number % 10;
            sum = sum + firstNumber;
            number = number / 10;
        }
        return sum;
    }
}
