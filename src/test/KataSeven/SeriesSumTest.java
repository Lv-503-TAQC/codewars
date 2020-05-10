package test.KataSeven;

import org.testng.Assert;
import org.testng.annotations.Test;
import ss.ita.kata.Seven;
import ss.ita.kata.implementation.liuba.LiubaSeven;
import ss.ita.kata.implementation.mykola.MykolaSeven;
import ss.ita.kata.implementation.nik.NikSeven;
import ss.ita.kata.implementation.taras.TarasSeven;

public class SeriesSumTest {

    Seven tarasSeven = new TarasSeven();
    Seven liubaSeven = new LiubaSeven();
    Seven nikSeven = new NikSeven();
    Seven MykolaSeven = new MykolaSeven();

    @Test
    void test1() {
        Assert.assertEquals(tarasSeven.seriesSum(5), "1,57");
        System.out.println("Test1 is completed");
    }

    @Test
    void test2() {
        Assert.assertEquals(tarasSeven.seriesSum(9), "1,77");
        System.out.println("Test2 is completed");
    }

    @Test
    void test3() {
        Assert.assertEquals(tarasSeven.seriesSum(15), "1,94");
        System.out.println("Test3 is completed");
    }
}
