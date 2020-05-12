package test.kata.implementation.nik;

import org.testng.Assert;
import org.testng.annotations.Test;
import ss.ita.kata.implementation.nik.NikSeven;

public class NikSevenTest {

    @Test
    public void whereIsHeTest() {
        System.out.println("Test 'Where is Vasya?'");
        Assert.assertEquals(new NikSeven().whereIsHe(3, 5,2), -2, "Oops...");
    }
}
