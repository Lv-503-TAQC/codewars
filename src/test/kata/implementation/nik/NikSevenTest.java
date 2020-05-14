package test.kata.implementation.nik;

import org.testng.Assert;
import org.testng.annotations.Test;
import ss.ita.kata.implementation.nik.NikSeven;

public class NikSevenTest {
    NikSeven nik = new NikSeven();
    @Test(groups = {"seven", "whereIsHe"})
    public void whereIsHeTest_1() {
        System.out.println("NikSeven/whereIsHe");
        Assert.assertEquals(nik.whereIsHe(3, 1, 1), 2, "whereIsHe_1");
    }

    @Test(groups = {"seven", "whereIsHe"})
    public void whereIsHe_2() {
        System.out.println("NikSeven/whereIsHe");
        Assert.assertEquals(nik.whereIsHe(5, 2, 3), 3, "whereIsHe_2");
    }

    //================================================================================================================
    @Test(groups = {"seven", "seriesSum"})
    public void seriesSum_1() {
        System.out.println("NikSeven/seriesSum");
        Assert.assertEquals(nik.seriesSum(5), "1.57", "seriesSum_1");
    }

    @Test(groups = {"seven", "seriesSum"})
    public void seriesSum_2() {
        System.out.println("NikSeven/seriesSum");
        Assert.assertEquals(nik.seriesSum(9), "1.77", "seriesSum_2");
    }

    @Test(groups = {"seven", "seriesSum"})
    public void seriesSum_3() {
        System.out.println("NikSeven/seriesSum");
        Assert.assertEquals(nik.seriesSum(15), "1.94", "seriesSum_3");
    }



    //================================================================================================================
    @Test(groups = {"seven", "newAwg"})
    public void newAvg_1() {
        System.out.println("NikSeven/newAwg");
        Assert.assertEquals(nik.newAvg(new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90), 628,
                            "newAwg_1");
    }

    @Test(groups = {"seven", "newAwg"})
    public void newAwg_2() {
        System.out.println("NikSeven/newAwg");
        Assert.assertEquals(nik.newAvg(new double[] {14, 30, 5, 7, 9, 11, 15}, 92), 645,
                            "newAwg_2");
    }

    @Test(expectedExceptions = IllegalArgumentException.class, groups = {"seven", "newAwg"})
    public void newAwg_3() {
        System.out.println("NikSeven/newAwg");
        System.out.println("waiting for IllegalArgumentException");
        nik.newAvg(new double[] {14, 30, 5, 7, 9, 11, 15}, 2);
    }


    //===============================================================================================================

}
