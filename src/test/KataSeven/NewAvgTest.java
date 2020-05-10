package test.KataSeven;

import org.testng.Assert;
import org.testng.annotations.Test;
import ss.ita.kata.Seven;
import ss.ita.kata.implementation.liuba.LiubaSeven;
import ss.ita.kata.implementation.mykola.MykolaSeven;
import ss.ita.kata.implementation.nik.NikSeven;
import ss.ita.kata.implementation.taras.TarasSeven;

public class NewAvgTest {

    Seven tarasSeven = new TarasSeven();
    Seven liubaSeven = new LiubaSeven();
    Seven nikSeven = new NikSeven();
    Seven MykolaSeven = new MykolaSeven();

    @Test
    public void test() {
        System.out.println("Fixed Tests newAvg");
        double[] a = new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
        Assert.assertEquals(tarasSeven.newAvg(a, 90), 628);

        a = new double[]{14, 30, 5, 7, 9, 11, 15};
        Assert.assertEquals(tarasSeven.newAvg(a, 92), 645);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testIllegalArgumentException1() {
        System.out.println("--- Exception 1 ---");
        double[]a = new double[] {14, 30, 5, 7, 9, 11, 15};
        tarasSeven.newAvg(a, 2);
    }
}
