package test.kata.implementation.liuba;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ss.ita.kata.Six;
import ss.ita.kata.implementation.liuba.LiubaSix;

import static org.testng.Assert.assertEquals;

public class LiubaSixTest {

    Six ipml = new LiubaSix();
//    Six ipml = new TarasSix();
//    Six ipml = new NikSix();
//    Six ipml = new MykolaSix();

    @Test(dataProvider="balance")
    public void balance (String input, String expected) {
        String actual = ipml.balance(input);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] balance() {

        Object [][] data = new Object [2][2];

        data[0][0] = "1000.00!=\n125 Market !=:125.45\n126 Hardware{} =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10";
        data[0][1] = "Original Balance: 1000.00\\r\\n125 Market 125.45 Balance 874.55\\r\\n126 Hardware 34.95 Balance 839.60\\r\\n127 Video 7.45 Balance 832.15"
                + "\\r\\n128 Book 14.32 Balance 817.83\\r\\n129 Gasoline 16.10 Balance 801.73\\r\\nTotal expense  198.27\\r\\nAverage expense  39.65";
        data[1][0] = "1233.00\n125 Hardware;! 24.80?\n123 Flowers 93.50;\n127 Meat 120.90\n120 Picture 34.00\n124 Gasoline 11.00\n"
                + "123 Photos;! 71.40?\n122 Picture 93.50\n132 Tyres;! 19.00,?;\n129 Stamps; 13.60\n129 Fruits{} 17.60\n129 Market;! 128.00?\n121 Gasoline;! 13.60?";
        data[1][1] = "Original Balance: 1233.00\\r\\n125 Hardware 24.80 Balance 1208.20\\r\\n123 Flowers 93.50 Balance 1114.70\\r\\n127 Meat 120.90 Balance 993.80\\r\\n"
                + "120 Picture 34.00 Balance 959.80\\r\\n124 Gasoline 11.00 Balance 948.80\\r\\n123 Photos 71.40 Balance 877.40\\r\\n122 Picture 93.50 Balance 783.90\\r\\n132 Tyres 19.00 Balance 764.90\\r\\n129 Stamps 13.60 Balance 751.30\\r\\n129 Fruits 17.60 Balance 733.70\\r\\n129 Market 128.00 Balance 605.70\\r\\n121 Gasoline 13.60 Balance 592.10\\r\\nTotal expense  640.90\\r\\nAverage expense  53.41";

        return data;
    }

    @Test(dataProvider="findNb")
    public void findNb (long expected, long input) {
        long actual = ipml.findNb(input);
        Assert.assertEquals(actual, expected);

    }

    @DataProvider
    public Object[][] findNb() {

        Object [][] data = new Object [2][2];

        data[0][0] = 2022;
        data[0][1] = 4183059834009L;
        data[1][0] = -1;
        data[1][1] = 24723578342962L;

        return data;
    }

    @Test(dataProvider="stockSummary")
    public void stockSummary(String[] codes,String[] letters, String expected) {
        String actual = ipml.stockSummary(codes, letters);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] stockSummary() {

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
