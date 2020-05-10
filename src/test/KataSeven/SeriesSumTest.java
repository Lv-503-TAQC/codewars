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
        Assert.assertEquals("1,57", tarasSeven.seriesSum(5));
    }

    @Test
    void test2() {
        Assert.assertEquals("1,77", tarasSeven.seriesSum(9));
    }

    @Test
    void test3() {
        Assert.assertEquals("1,94", tarasSeven.seriesSum(15));
    }
}
