package ss.ita.kata.implementation.nik;

import ss.ita.kata.Seven;

<<<<<<< HEAD:src/ss/ita/kataimpl/NikKataSevenImpl.java
import java.util.Arrays;

public class NikKataSevenImpl implements KataSeven {
=======
public class NikSeven implements Seven {
>>>>>>> d6c482a661a54a2ce6a10bb38d7bd2569de1e4e8:src/ss/ita/kata/implementation/nik/NikSeven.java
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
