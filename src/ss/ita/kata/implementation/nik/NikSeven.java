package ss.ita.kata.implementation.nik;

import ss.ita.kata.Seven;

public class NikSeven implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        if(p - bef > aft) return aft + 1;
        return p - bef;
    }
}
