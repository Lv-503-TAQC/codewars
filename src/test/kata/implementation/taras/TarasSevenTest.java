package test.kata.implementation.taras;

import org.testng.Assert;
import org.testng.annotations.Test;
import ss.ita.kata.implementation.taras.TarasSeven;

public class TarasSevenTest {
    TarasSeven tarasSeven = new TarasSeven();

    @Test
    public void newAvgTest() {
        System.out.println("Fixed Tests newAvg");

        double[] a = new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
        Assert.assertEquals(tarasSeven.newAvg(a, 90), 628);

        a = new double[]{14, 30, 5, 7, 9, 11, 15};
        Assert.assertEquals(tarasSeven.newAvg(a, 92), 645);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void newAvgTestIllegalArgumentException() {
        System.out.println("--- Exception ---");
        double[]a = new double[] {14, 30, 5, 7, 9, 11, 15};
        tarasSeven.newAvg(a, 2);
    }

    @Test
    void seriesSumTest1() {
        Assert.assertEquals(tarasSeven.seriesSum(5), "1,57");
    }

    @Test
    void seriesSumTest2() {
        Assert.assertEquals(tarasSeven.seriesSum(9), "1,77");
    }

    @Test
    void seriesSumTest3() {
        Assert.assertEquals(tarasSeven.seriesSum(15), "1,94");
    }

    @Test
    public void whereIsHeTest1(){
        Assert.assertEquals(tarasSeven.whereIsHe(3, 1, 1), 2);
    }

    @Test
    public void whereIsHeTest2(){
        Assert.assertEquals(tarasSeven.whereIsHe(5, 2, 3), 3);
    }
}
