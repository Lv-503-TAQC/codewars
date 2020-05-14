package test.kata.implementation.nik;

import org.testng.Assert;
import org.testng.annotations.Test;
import ss.ita.kata.implementation.nik.NikEight;

public class NikEightTest {
    NikEight nik = new NikEight();

    //================================================================================================================
    @Test(groups = {"eight", "liters"})
    public void liters_1() {
        System.out.println("NikEight/liters");
        Assert.assertEquals(nik.liters(2), 1, "liters_1");
    }

    @Test(groups = {"eight", "liters"})
    public void liters_2() {
        System.out.println("NikEight/liters");
        Assert.assertEquals(nik.liters(0.97), 0, "liters_2");
    }

    @Test(groups = {"eight", "liters"})
    public void liters_3() {
        System.out.println("NikEight/liters");
        Assert.assertEquals(nik.liters(14.64), 7, "liters_3");
    }

    @Test(groups = {"eight", "liters"})
    public void liters_4() {
        System.out.println("NikEight/liters");
        Assert.assertEquals(nik.liters(1600.20), 800, "liters_4");
    }

    @Test (groups = {"eight", "liters"})
    public void liters_5() {
        System.out.println("NikEight/liters");
        Assert.assertEquals(nik.liters(80), 40, "liters_5");
    }


    //===============================================================================================================
    @Test(groups = {"eight", "getVolumeOfCuboid"})
    public void getVolumeOfCuboid_1() {
        System.out.println("NikEight/getVolumeOfCuboid");
        Assert.assertEquals(nik.getVolumeOfCuboid(1,2,2), 4, "getVolumeOfCuboid_1");
    }

    @Test(groups = {"eight", "getVolumeOfCuboid"})
    public void getVolumeOfCuboid_2() {
        System.out.println("NikEight/getVolumeOfCuboid");
        Assert.assertEquals(nik.getVolumeOfCuboid(6.3,2,5), 63, "getVolumeOfCuboid_2");
    }


    //===============================================================================================================
    @Test(groups = {"eight", "mpgToKPM"})
    public void mpgToKPM_1() {
        System.out.println("NikEight/mpgToKMP");
        Assert.assertEquals(nik.mpgToKPM(10), 3.54f, 0.001f, "mpgToKPM_1");
    }

    @Test(groups = {"eight", "mpgToKPM"})
    public void mpgToKPM_2() {
        System.out.println("NikEight/mpgToKMP");
        Assert.assertEquals(nik.mpgToKPM(20), 7.08f, 0.001f, "mpgToKPM_2");
    }

    @Test(groups = {"eight", "mpgToKPM"})
    public void mpgToKPM_3() {
        Assert.assertEquals(nik.mpgToKPM(30), 10.62f, 0.001f, "mpgToKPM_3");
    }


    //=================================================================================================================
    @Test(groups = {"eight", "squareOrSquareRoot"})
    public void squareOrSquareRoot_1() {
        System.out.println("NikEight/squareOrSquareRoot");
        Assert.assertEquals(java.util.Arrays.toString(nik.squareOrSquareRoot(new int[] { 4, 3, 9, 7, 2, 1 })),
                            java.util.Arrays.toString(new int[] { 2, 9, 3, 49, 4, 1 }),
                    "squareOrSquareRoot_1");
    }

    @Test(groups = {"eight", "squareOrSquareRoot"})
    public void squareOfSquareRoot_2() {
        System.out.println("NikEight/squareOrSquareRoot");
        Assert.assertEquals(java.util.Arrays.toString(nik.squareOrSquareRoot(new int[] { 100, 101, 5, 5, 1, 1 })),
                                                        java.util.Arrays.toString(new int[] { 10, 10201, 25, 25, 1, 1 }),
                                                "squareOrSquareRoot_2");
    }

    @Test(groups = {"eight", "squareOrSquareRoot"})
    public void squareOrSquareRoot_3() {
        System.out.println("NikEight/squareOrSquareRoot");
        Assert.assertEquals(java.util.Arrays.toString(nik.squareOrSquareRoot(new int[] { 1, 2, 3, 4, 5, 6 })),
                            java.util.Arrays.toString(new int[] { 1, 4, 9, 2, 25, 36 }),
                            "squareOrSquareRoot_3");
    }


    //=================================================================================================================
    @Test(groups = {"eight", "countPositivesSumNegatives"})
    public void countPositivesSumNegatives_1() {
        System.out.println("NikEight/countPositivesSumNegatives");
        Assert.assertEquals(nik.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}),
                            new int[] {10, -65}, "countPositivesSumNegatives_1");
    }

    @Test(groups = {"eight", "countPositivesSumNegatives_2"})
    public void countPositivesSumNegtives_2() {
        System.out.println("NikEight/countPositivesSumNegatives");
        Assert.assertEquals(nik.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}),
                            new int[] {8, -50}, "countPositivesSumNegatives_2");
    }


    //=================================================================================================================
    @Test(groups = {"eight", "stringToNumber"})
    public void stringToNumber_1() {
        System.out.println("NikEight/stringToNumber");
        Assert.assertEquals(nik.stringToNumber("1234"), 1234, "stringToNumber_1");
    }


    //=================================================================================================================
    @Test(groups = {"eight", "amIWilson"})
    public void amIWilson_1() {
        System.out.println("NikEight/amIWilson");
        Assert.assertEquals(nik.amIWilson(0), false, "amIWilson_1");
    }

    //=================================================================================================================
    @Test(groups = {"eight", "TwoDecimalPlaces"})
    public void twoDecimalPlaces_1() {
        System.out.println("NkEight/TwoDecimalPlaces");
        Assert.assertEquals(nik.TwoDecimalPlaces(4.659725356), 4.66, 0.00, "TwoDecimalPlaces_1");
    }

    @Test(groups = {"eight", "TwoDecimalPlaces"})
    public void twoDecimalPlaces_2() {
        System.out.println("NkEight/TwoDecimalPlaces");
        Assert.assertEquals(nik.TwoDecimalPlaces(173735326.3783732637948948), 173735326.38, 0.00, "TwoDecimalPlaces_2");
    }


    //==================================================================================================================

}
