package ss.ita.kata.implementation.nik;

import ss.ita.kata.Eight;

public class NikEight implements Eight {
    @Override
    public int liters(double time) {
        return (int)Math.floor(time*0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        double result1 = mpg*1.609344 / 4.54609188;
        double result2 = Math.round(result1*100);
        int result3 = (int)result2;
        float result = (float)(result3 / 100.0);
        return result;
    }

    @Override
    public String[] fixTheMeerkat(String[] arr) {
        return new String[0];
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(Math.sqrt(array[i])%1 != 0.0) array[i] = array[i] * array[i];
            else array[i] = (int)(Math.sqrt(array[i]));
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if(input == null || input.length == 0) {
            return new int[]{};
        } else {
            int positiv = 0, negativ = 0;
            for(int i = 0; i < input.length; i++) {
                if(input[i] > 0) positiv++;
                else if(input[i] < 0) negativ += input[i];
            }
            return new int[]{positiv, negativ};
        }
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
        return (Math.round(number*100))/100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
