package test.kata.implementation.liuba;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ss.ita.kata.Eight;
import ss.ita.kata.implementation.liuba.LiubaEight;
import static org.testng.Assert.assertEquals;

public class LiubaEightTest {

    Eight ipml = new LiubaEight();

    /*Keep Hydrated!*/
    @Test(dataProvider="litersTest")
    public void litersTest(double input, double expected) {
         double actual = ipml.liters(input);
         assertEquals(actual, expected);

    }

    @DataProvider
    public Object[][] litersTest() {

        Object [][] data = new Object [2][2];

        data[0][0] = 0.97;
        data[0][1] = 0;
        data[1][0] = 1600.20;
        data[1][1] = 800;

        return data;
    }

    /*Volume of a Cuboid*/
    @Test(dataProvider="getVolumeOfCuboidTest")
    public void getVolumeOfCuboidTest(double length, double width, double height, double expected) {
        double actual = ipml.getVolumeOfCuboid(length,width,height);
        assertEquals(actual, expected);

    }

    @DataProvider
    public Object[][] getVolumeOfCuboidTest() {

        Object [][] data = new Object [2][4];

        data[0][0] = 6.3;
        data[0][1] = 2;
        data[0][2] = 5;
        data[0][3] = 63;
        data[1][0] = 1;
        data[1][1] = 2;
        data[1][2] = 2;
        data[1][3] = 4;

        return data;
    }

    /*Miles per gallon to kilometers per liter*/
    @Test
    public void mpgToKPMTest() {
        double actual = ipml.mpgToKPM(20);
        assertEquals(actual, 7.08f);

    }

    /*My head is at the wrong end!*/
    @Test(dataProvider="fixTheMeerkatTest")
    public void fixTheMeerkatTest(String [] input, String [] expected) {
        String [] actual = ipml.fixTheMeerkat(input);
        assertEquals(actual, expected);

    }

    @DataProvider
    public Object[][] fixTheMeerkatTest() {

        Object [][] data = new Object [2][2];

        data[0][0] = new String[]{ "head", "body", "tail" };
        data[0][1] = new String[]{ "tail", "body", "head" };
        data[1][0] = new String[]{ "upper legs", "torso", "lower legs" };
        data[1][1] = new String[]{ "lower legs", "torso", "upper legs" };

        return data;
    }

    /*To square(root) or not to square(root)*/
    @Test(dataProvider="squareOrSquareRootTest")
    public void squareOrSquareRootTest(int [] input, int [] expected) {
        int [] actual = ipml.squareOrSquareRoot(input);
        assertEquals(actual, expected);

    }

    @DataProvider
    public Object[][] squareOrSquareRootTest() {

        Object [][] data = new Object [2][2];

        data[0][0] = new int[] { 100, 101, 5, 5, 1, 1 };
        data[0][1] = new int[] { 10, 10201, 25, 25, 1, 1 };
        data[1][0] = new int[] { 4, 3, 9, 7, 2, 1 };
        data[1][1] = new int[] { 2, 9, 3, 49, 4, 1 };

        return data;
    }

    /*Convert a String to a Number!*/
    @Test(dataProvider="stringToNumberTest")
    public void stringToNumberTest(String input, int expected) {
        int actual = ipml.stringToNumber(input);
        assertEquals(actual, expected);

    }

    @DataProvider
    public Object[][] stringToNumberTest() {

        Object [][] data = new Object [2][2];

        data[0][0] = "1405";
        data[0][1] = 1405;
        data[1][0] = "-7";
        data[1][1] = -7;

        return data;
    }

    /*Formatting decimal places #0*/
    @Test(dataProvider="TwoDecimalPlacesTest")
    public void TwoDecimalPlacesTest(double input, double expected) {
        double actual = ipml.TwoDecimalPlaces(input);
        assertEquals(actual, expected);

    }

    @DataProvider
    public Object[][] TwoDecimalPlacesTest() {

        Object [][] data = new Object [2][2];

        data[0][0] = 4.659725356;
        data[0][1] = 4.66;
        data[1][0] = 173735326.3783732637948948;
        data[1][1] = 173735326.38;

        return data;
    }

    /*Find numbers which are divisible by given number*/
    @Test(dataProvider="divisibleByTest")
    public void divisibleByTest(int [] array, int divider, int [] expected) {
        int [] actual = ipml.divisibleBy(array,divider);
        assertEquals(actual, expected);

    }

    @DataProvider
    public Object[][] divisibleByTest() {

        Object [][] data = new Object [2][3];

        data[0][0] = new int[] {0,1,2,3,4,5,6};
        data[0][1] = 4;
        data[0][2] = new int[] {0,4};
        data[1][0] = new int[] {1,2,3,4,5,6};
        data[1][1] = 3;
        data[1][2] = new int[] {3,6};

        return data;
    }
}
