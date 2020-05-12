package ss.ita;

import ss.ita.kata.Seven;
import ss.ita.kata.implementation.taras.TarasSeven;
import ss.ita.utils.Reader;
import ss.ita.utils.ScannerImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Reader r = new Reader();
        Seven tarasSeven = new TarasSeven();
        String result = tarasSeven.seriesSum(r.readInt());
        System.out.println(result);

    }
}
