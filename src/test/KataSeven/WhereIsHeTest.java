package test.KataSeven;

import org.testng.Assert;
import org.testng.annotations.Test;
import ss.ita.kata.Seven;
import ss.ita.kata.implementation.liuba.LiubaSeven;
import ss.ita.kata.implementation.mykola.MykolaSeven;
import ss.ita.kata.implementation.nik.NikSeven;
import ss.ita.kata.implementation.taras.TarasSeven;

public class WhereIsHeTest {
    Seven tarasSeven = new TarasSeven();
    Seven liubaSeven = new LiubaSeven();
    Seven nikSeven = new NikSeven();
    Seven mykolaSeven = new MykolaSeven();

    @Test
    public void test1(){
        Assert.assertEquals(2, tarasSeven.whereIsHe(3, 1, 1));
    }

    @Test
    public void test2(){
        Assert.assertEquals(3, tarasSeven.whereIsHe(5, 2, 3));
    }
}
