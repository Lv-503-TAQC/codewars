package test.KataSix;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ss.ita.kata.Six;
import ss.ita.kata.implementation.liuba.LiubaSix;
import ss.ita.kata.implementation.mykola.MykolaSix;
import ss.ita.kata.implementation.nik.NikSix;
import ss.ita.kata.implementation.taras.TarasSix;

public class FindNbTest {

    Six ipml = new LiubaSix();
//    Six ipml = new TarasSix();
//    Six ipml = new NikSix();
//    Six ipml = new MykolaSix();

    @Test(dataProvider="getData")
    public void findNb (long expected, long input) {
        long actual = ipml.findNb(input);
        Assert.assertEquals(actual, expected);

    }

    @DataProvider
    public Object[][] getData() {

        Object [][] data = new Object [2][2];

        data[0][0] = 2022;
        data[0][1] = 4183059834009L;
        data[1][0] = -1;
        data[1][1] = 24723578342962L;

        return data;
    }

}
