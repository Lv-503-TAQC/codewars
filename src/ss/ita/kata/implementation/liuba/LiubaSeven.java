package ss.ita.kata.implementation.liuba;

import ss.ita.kata.Seven;

public class LiubaSeven implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double number = arr.length + 1;
        double sum = 0;

        for (double x : arr) {

            sum = sum + x;
        }


        double donation = navg * number - sum;
        long donut = (long) Math.ceil(donation);

        if (donation > 0) {
            return donut;
        } else
            throw new java.lang.IllegalArgumentException("Illegal argument :(");
    }

    @Override
    public String seriesSum(int n) {
        double s = 0;
        int divideBy = 1;

        for (double i = 0; i < n; i++) {

            s = s + 1.0 / (divideBy);
            divideBy = divideBy + 3;

        }
        s = Math.round(s * 100.0) / 100.0;

        String string = String.valueOf(s);

        return String.format("%.2f", s);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int vasya = bef + 1;
        int count = 1;

        for (; vasya < p; vasya++) {

            if (vasya + aft >= p) {
                count++;
            }
        }
        return count;
    }
}
