package pl.sdacademy.homework1;

public class MilesToKilometers {
    private final double DIFFERENCE_BETWEEN = 1.609344;

    public double calculateMilesToKilometers(double miles) {
        return miles * DIFFERENCE_BETWEEN;
    }
}
