package test.kata.implementation.liuba;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ss.ita.kata.Six;
import ss.ita.kata.implementation.liuba.LiubaSix;
import ss.ita.kata.implementation.mykola.MykolaSix;
import ss.ita.kata.implementation.nik.NikSix;
import ss.ita.kata.implementation.taras.TarasSix;
import static org.testng.Assert.assertEquals;

public class StockSummaryTest {

    Six ipml = new LiubaSix();
//    Six ipml = new TarasSix();
//    Six ipml = new NikSix();
//    Six ipml = new MykolaSix();

    @Test(dataProvider="getData")
    public void stockSummary(String[] codes,String[] letters, String expected) {
        String actual = ipml.stockSummary(codes, letters);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] getData() {

        Object [][] data = new Object [2][3];

        data[0][0] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        data[0][1] = new String[]{"A", "B"};
        data[0][2] = "(A : 200) - (B : 1140)";
        data[1][0] = new String[]{"ABAR 200", "CDXE 500", "AJKWR 150", "KTSQ 890", "DRTY 600"};;
        data[1][1] = new String[]{"A", "B", "C"};
        data[1][2] = "(A : 350) - (B : 0) - (C : 500)";

        return data;
    }
}

