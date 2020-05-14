package ss.ita.kata.implementation.nik;

import ss.ita.kata.Seven;

public class NikSeven implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        long result = (long)Math.ceil((navg * (arr.length+1) - java.util.stream.DoubleStream.of(arr).sum()));
        if(result <= 0) throw new java.lang.IllegalArgumentException();

        return result;
    }

    @Override
    public String seriesSum(int n) {
        int divisor = 1;
        double result = 0;
        for(int i = 0; i < n; i++) {
            result += 1.0f/divisor;
            divisor +=3;
        }
        String str = String.valueOf((int)Math.round(result * 100));
        String str1 = str.substring(0, str.length()-2) + ".";
        String str2 = str.substring(str.length() - 2, str.length());
        return str1+str2;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        if(p - bef > aft) return aft + 1;
        return p - bef;
    }
}
