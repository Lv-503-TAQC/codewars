package test.kata.implementation.taras;

import org.testng.Assert;
import org.testng.annotations.Test;
import ss.ita.kata.implementation.taras.TarasEight;
import ss.ita.kata.implementation.taras.TarasSix;

public class TarasSixTest {
    TarasSix tarasSix = new TarasSix();

    @Test
    public void findNbBasicTest() {
        Assert.assertEquals(tarasSix.findNb(4183059834009L), 2022);
    }

    @Test
    public void findNbBasicTest2() {
        Assert.assertEquals(tarasSix.findNb(24723578342962L), -1);
    }

    @Test
    public void findNbBasicTest3() {
        Assert.assertEquals(tarasSix.findNb(135440716410000L), 4824);
    }

    @Test
    public void findNbBasicTest4() {
        Assert.assertEquals(tarasSix.findNb(40539911473216L), 3568);
    }
}
