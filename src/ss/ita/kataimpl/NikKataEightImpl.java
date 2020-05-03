package ss.ita.kataimpl;

import ss.ita.kata.KataEight;

import java.util.stream.IntStream;

public class NikKataEightImpl implements KataEight {
    @Override
    public int Liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public String[] fixTheMeerkat(String[] arr) {
        return new String[0];
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return IntStream.of(numbers).filter(e -> e%divider == 0).toArray();
    }
}
