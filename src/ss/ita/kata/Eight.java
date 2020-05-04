package ss.ita.kata;

public interface Eight {
//    Keep Hydrated!
    int Liters(final double time);

//    Volume of a cuboid
    double getVolumeOfCuboid(final double length, final double width, final double height);

//    Miles per gallon to kilometers per liter
    float mpgToKPM(final float mpg);

//    My head is at the wrong end
    String[] fixTheMeerkat(final String[] arr);

//    To square root or no to square
    int[] squareOrSquareRoot(final int[] array);

//    Count of positives / sum of negatives
    int[] countPositivesSumNegatives(final int[] input);

//    Convert a String to a Number!
    int stringToNumber(final String str);

//    Willson primes
    boolean amIWilson(final double n);

//    Formatting decimal places
    double TwoDecimalPlaces(final double number);

//    Find numbers which are divisible by given number
    int[] divisibleBy(final int[] numbers, final int divider);
}
