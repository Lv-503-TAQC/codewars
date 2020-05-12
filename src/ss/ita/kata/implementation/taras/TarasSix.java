package ss.ita.kata.implementation.taras;

import ss.ita.kata.Six;

public class TarasSix implements Six {
    @Override
    public long findNb(long m) {
        long n = 1L;
        for (int i = 0; i < Math.cbrt(m); i++) {
            n++;
            long l = (n * (n + 1)) / 2;

            if (l * l == m) {
                return n;
            }
        }

        return -1;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
