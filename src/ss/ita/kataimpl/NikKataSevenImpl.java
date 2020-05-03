package ss.ita.kataimpl;

import ss.ita.kata.KataSeven;

import java.util.Arrays;

public class NikKataSevenImpl implements KataSeven {
    @Override
    public long newAvg(double[] a, double navg) {
        double sum = Arrays.stream(a).sum();
        double result = navg * (a.length + 1) - sum;
        if (result > 0) {
            return Math.round(Math.ceil(result));
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String seriesSum(int n) {

        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft){
        if(p - bef > aft) return aft + 1;
        return p - bef;
    }
}
