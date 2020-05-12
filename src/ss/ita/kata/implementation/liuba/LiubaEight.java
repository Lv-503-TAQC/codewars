package ss.ita.kata.implementation.liuba;

import ss.ita.kata.Eight;

import java.util.Arrays;

public class LiubaEight implements Eight {
    @Override
    public int liters(double time) {
        double b = time * 0.5;
        return (int) b;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float kpl = mpg * 1.609344f / 4.54609188f;
        float rounded = Math.round(kpl * 100.0f) / 100.0f;
        return rounded;
    }

    @Override
    public String[] fixTheMeerkat(String[] arr) {
        return new String[]{arr[2], arr[1], arr[0]};
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int arrayLength = array.length;
        int[] arrayTwo = new int[arrayLength];


        for (int i = 0; i < arrayLength; i++) {

            double x = array[i];
            double y = Math.sqrt(x);
            double z = y % 1;

            if (z == 0) {
                int r = (int) y;
                arrayTwo[i] = r;

            } else if (z > 0) {
                double rr = x * x;
                int r = (int) rr;
                arrayTwo[i] = r;

            }
        }
        return arrayTwo;

    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] Count = new int[0];
        int[] Count2 = new int[2];

        if (input != null && input.length > 0) {
            Count = Count2;

            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {

                    Count[0] = Count[0] + 1;
                } else if (input[i] < 0) {
                    Count[1] = Count[1] + input[i];
                }
            }
        }


        return Count;
    }

    @Override
    public int stringToNumber(String str) {
        int number = Integer.parseInt(str);
        return number;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        double rounded = Math.round(number * 100.0d) / 100.0d;
        return rounded;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int[] result = Arrays.stream(numbers)
                .filter(i -> (i % divider) == 0)
                .toArray();
        return result;
    }
}
