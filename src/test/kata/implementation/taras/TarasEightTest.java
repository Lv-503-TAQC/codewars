package test.kata.implementation.taras;

import org.testng.Assert;
import org.testng.annotations.Test;
import ss.ita.kata.implementation.taras.TarasEight;

import java.util.Arrays;

public class TarasEightTest {
    TarasEight tarasEight = new TarasEight();

    @Test
    public void countPositivesSumNegativesBasicTest() {
        int[] expectedResult = new int[]{10, -65};
        Assert.assertEquals(tarasEight.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}), expectedResult);
    }

    @Test
    public void countPositivesSumNegativesInputWithZeroes() {
        int[] expectedResult = new int[]{8, -50};
        Assert.assertEquals(tarasEight.countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}), expectedResult);
    }

    @Test
    public void divisibleByBasicTest() {
        Assert.assertEquals(tarasEight.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2), new int[]{2, 4, 6});
    }

    @Test
    public void divisibleByBasicTest2() {
        Assert.assertEquals(tarasEight.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3), new int[]{3, 6});
    }

    @Test
    public void divisibleByBasicTest3() {
        Assert.assertEquals(tarasEight.divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4), new int[]{0, 4});
    }

    @Test
    public void twoDecimalPlacesBasicTest() {
        Assert.assertEquals(tarasEight.TwoDecimalPlaces(4.659725356), 4.66, 0.00);
    }

    @Test
    public void twoDecimalPlacesBasicTest2() {
        Assert.assertEquals(tarasEight.TwoDecimalPlaces(173735326.3783732637948948), 173735326.38, 0.00);
    }

    @Test
    public void amIWilsonBasicTest() {
        Assert.assertEquals(tarasEight.amIWilson(0), false);
    }

    @Test
    public void amIWilsonBasicTest2() {
        Assert.assertEquals(tarasEight.amIWilson(1), false);
    }

    @Test
    public void amIWilsonBasicTest3() {
        Assert.assertEquals(tarasEight.amIWilson(5), true);
    }

    @Test
    public void stringToNumberBasicTest() {
        Assert.assertEquals(tarasEight.stringToNumber("1234"), 1234, "stringToNumber(1234)");
    }

    @Test
    public void stringToNumberBasicTest2() {
        Assert.assertEquals(tarasEight.stringToNumber("605"), 605, "stringToNumber(605)");
    }

    @Test
    public void stringToNumberBasicTest3() {
        Assert.assertEquals(tarasEight.stringToNumber("1405"), 1405, "stringToNumber(1405)");
    }

    @Test
    public void stringToNumberBasicTest4() {
        Assert.assertEquals(tarasEight.stringToNumber("-7"), -7, "stringToNumber(-7)");
    }

    @Test
    public void squareOrSquareRootBasicTest() {
        int[] input = new int[]{4, 3, 9, 7, 2, 1};
        int[] expected = new int[]{2, 9, 3, 49, 4, 1};
        Assert.assertEquals(Arrays.toString(tarasEight.squareOrSquareRoot(input)), Arrays.toString(expected));
    }

    @Test
    public void squareOrSquareRootBasicTest2() {
        int[] input = new int[]{100, 101, 5, 5, 1, 1};
        int[] expected = new int[]{10, 10201, 25, 25, 1, 1};
        Assert.assertEquals(Arrays.toString(tarasEight.squareOrSquareRoot(input)), Arrays.toString(expected));
    }

    @Test
    public void squareOrSquareRootBasicTest3() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int[] expected = new int[]{1, 4, 9, 2, 25, 36};
        Assert.assertEquals(Arrays.toString(tarasEight.squareOrSquareRoot(input)), Arrays.toString(expected));
    }

    @Test
    public void fixTheMeerkatBasicTest() {
        Assert.assertEquals(tarasEight.fixTheMeerkat(new String[]{"tail", "body", "head"}),
                new String[]{"head", "body", "tail"});
    }

    @Test
    public void mpgToKPMBasicTest() {
        Assert.assertEquals(tarasEight.mpgToKPM(10), 3.54f, 0.001f);
    }

    @Test
    public void mpgToKPMBasicTest2() {
        Assert.assertEquals(tarasEight.mpgToKPM(20), 7.08f, 0.001f);
    }

    @Test
    public void mpgToKPMBasicTest3() {
        Assert.assertEquals(tarasEight.mpgToKPM(30), 10.62f, 0.001f);
    }

    @Test
    public void volumeOfCuboidBasicTest() {
        Assert.assertEquals(tarasEight.getVolumeOfCuboid(1, 2, 2), 4, 0.0001);
    }

    @Test
    public void volumeOfCuboidBasicTest2() {
        Assert.assertEquals(tarasEight.getVolumeOfCuboid(6.3, 2, 5), 63, 0.0001);
    }

    @Test
    public void litersBasicTest() {
        Assert.assertEquals(tarasEight.liters(0.97), 0);
    }

    @Test
    public void litersBasicTest2() {
        Assert.assertEquals(tarasEight.liters(14.64), 7);
    }

    @Test
    public void litersBasicTest3() {
        Assert.assertEquals(tarasEight.liters(1600.20), 800);
    }
}
