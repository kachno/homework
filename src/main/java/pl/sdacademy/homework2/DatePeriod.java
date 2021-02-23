package pl.sdacademy.homework2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DatePeriod {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        final LocalDate[] values = new LocalDate[args.length];
        int count = 0;
        for (String arg : args) {
            if (Pattern.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}$", arg)) {
                LocalDate value = LocalDate.parse(arg);
                values[count] = value;
                count++;
            }
        }
        LocalDate[] checkedValues = Arrays.copyOf(values, count);
        Arrays.sort(checkedValues);
        System.out.println(Arrays.toString(checkedValues));
        System.out.println(checkedValues[0].until(checkedValues[checkedValues.length - 1]));
    }
}
