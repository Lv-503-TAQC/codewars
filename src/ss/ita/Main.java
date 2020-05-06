package ss.ita;

import ss.ita.utils.Reader;
import ss.ita.utils.ScannerImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Reader s = new Reader();
        int[] x = s.readNumberArray2();
        System.out.println(Arrays.toString(x));
    }
}
