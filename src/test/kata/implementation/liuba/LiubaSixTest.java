package test.kata.implementation.liuba;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ss.ita.kata.Six;
import ss.ita.kata.implementation.liuba.LiubaSix;

import static org.testng.Assert.assertEquals;

public class LiubaSixTest {

    Six ipml = new LiubaSix();


    /*Build a pile of Cubes*/
    @Test(dataProvider="findNbTest")
    public void findNbTest (long expected, long input) {
        long actual = ipml.findNb(input);
        assertEquals(actual, expected);

    }

    @DataProvider
    public Object[][] findNbTest() {

        Object [][] data = new Object [2][2];

        data[0][0] = 2022;
        data[0][1] = 4183059834009L;
        data[1][0] = -1;
        data[1][1] = 24723578342962L;

        return data;
    }

    /*Easy Balance Checking*/
    @Test(dataProvider="balanceTest")
    public void balanceTest (String input, String expected) {
        String actual = ipml.balance(input);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] balanceTest() {

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


    /*Ranking NBA teams*/
    @Test(dataProvider="nbaCupTest")
     public void nbaCupTest(String games, String team, String expected){
         String actual = ipml.nbaCup(games, team);
            assertEquals(actual, expected);
        }

    @DataProvider
    public Object[][] nbaCupTest() {

        Object [][] data = new Object [4][3];

        data[0][0] = "San Antonio Spurs 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,"
                + "Los Angeles Lakers 97 Golden State Warriors 136,Utah Jazz 98 Denver Nuggets 78,Boston Celtics 99 New York Knicks 85,"
                + "Miami Heat 110 Washington Wizards 105,Detroit Pistons 94 Charlotte Hornets 99,Orlando Magic 110 New Orleans Pelicans 107,"
                + "Chicago Bulls 103 Indiana Pacers 94,Milwaukee Bucks 106 Minnesota Timberwolves 88,Los Angeles Lakers 104 Portland Trail Blazers 102,"
                + "Houston Rockets 120 New Orleans Pelicans 100,Boston Celtics 111 Brooklyn Nets 105,Charlotte Hornets 94 Chicago Bulls 86,";

        data[0][1] = "Boston Celtics";
        data[0][2] = "Boston Celtics:W=3;D=0;L=0;Scored=291;Conceded=255;Points=9";
        data[1][0] = "San Antonio Spurs 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,";
        data[1][1] = "";
        data[1][2] = "";
        data[2][0] = "Boston Celtics 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81.112 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,";
        data[2][1] = "Boston Celtics";
        data[2][2] = "Error(float number):Boston Celtics 81.112 Philadelphia 76ers 65";

        data[3][0] = "Boston Celtics 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81.112 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,";
        data[3][1] = "Boston Celt";
        data[3][2] = "Boston Celt:This team didn't play!";


        return data;
    }


    /*Help the bookseller !*/
    @Test(dataProvider="stockSummaryTest")
    public void stockSummaryTest(String[] codes,String[] letters, String expected) {
        String actual = ipml.stockSummary(codes, letters);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] stockSummaryTest() {

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
