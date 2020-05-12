package ss.ita.kata.implementation.taras;

import ss.ita.kata.Eight;

public class TarasEight implements Eight {
    @Override
    public int liters(double time) {
        return (int)time/2;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float milesPerLiters = mpg/4.54609188f;
        float kpl = milesPerLiters*1.609344f;
        float kplRounded = Math.round(kpl * 100.0f) / 100.0f;

        return kplRounded;
    }

    @Override
    public String[] fixTheMeerkat(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        return arr;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int arrayModified[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                arrayModified[i] = (int) Math.sqrt(array[i]);
            } else {
                arrayModified[i] = array[i] * array[i];
            }
        }

        return arrayModified;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length <= 0) {
            int[] emptyArray = {};
            return emptyArray;
        }

        int positiveNumbers = 0;
        int negativeNumbers = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                positiveNumbers++;
            } else {
                negativeNumbers += input[i];
            }
        }

        int arrayCounted[] = {positiveNumbers, negativeNumbers};

        return arrayCounted;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return n == 5 || n == 13 || n == 563;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        StringBuffer intString = new StringBuffer();
        for (int number : numbers) {
            if (number % divider == 0) {
                intString.append(number + " ");
            }
        }

        String[] split = intString.toString().split("\\s");
        int[] intArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            intArr[i] = Integer.parseInt(split[i]);
        }
        return intArr;
    }
}
