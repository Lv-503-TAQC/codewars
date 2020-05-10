package ss.ita.kata.implementation.taras;

import ss.ita.kata.Seven;

public class TarasSeven implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sumOfArr = 0;
        for (double v : arr) {
            sumOfArr += v;
        }

        if (navg < sumOfArr / arr.length) {
            throw new IllegalArgumentException();
        }

        double result = (navg * (arr.length + 1)) - sumOfArr;

        return (long) Math.ceil(result);
    }

    @Override
    public String seriesSum(int n) {
        double startIncreaser = 4.0;
        double defaultIncreaser = 3.0;
        double result = 1.0;
        if (n > 1) {
            result += 1 / startIncreaser;
            for (int i = 0; i < n - 2; i++) {
                startIncreaser += defaultIncreaser;
                result += 1 / startIncreaser;
                System.out.println(startIncreaser);
            }
        }

        return String.format("%.2f", Math.round(result * 100.0) / 100.0);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int positionCount = 0;
        for (int i = 0; i < p - bef; i++) {
            positionCount += 1;
            if (positionCount > aft) {
                return positionCount;
            }
        }

        return positionCount;
    }
}
