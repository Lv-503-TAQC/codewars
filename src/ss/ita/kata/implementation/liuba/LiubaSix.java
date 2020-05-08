package ss.ita.kata.implementation.liuba;

import ss.ita.kata.Six;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LiubaSix implements Six {

    /*method used in "balance" method  to round up the numbers. Will be refactored.*/
    public static double round(double d) {
        return Math.round(d * 1000) / 1000.0;
    }

    @Override
    public long findNb(long m) {
        long n = 0;

        do {
            n++;
            m = m - (n * n * n);

            if (m < 0) {
                n = -1;
            }
        }
        while (m > 0);
        return n;
    }

    @Override
    public String balance(String book) {

        Pattern p = Pattern.compile("([a-z]+)|([A-Z]+)|([0-9]+)|[ ]+|\n|[//.+]");
        Matcher m = p.matcher(book);
        String string = "";

        while (m.find()) {
            string = string + book.substring(m.start(), m.end());
        }
        m.reset();
        p = Pattern.compile("[0-9]+[//.+][0-9]+");
        m = p.matcher(string);

        String string2 = "";


        while (m.find()) {
            if (string2.length() != 0) {
                string2 += " ";
            }
            string2 += string.substring(m.start(), m.end());
        }


        String[] numberArray = string2.split(" ");


        double[] doubleArray = new double[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            doubleArray[i] = Double.parseDouble(numberArray[i]);
        }

        String[] stringArray = string.split("\n");


        ArrayList<String> finalArray = new ArrayList<String>();

        double sum = doubleArray[0];

        finalArray.add("Original Balance: " + String.format("%.2f", sum));


        for (int i = 1; i < stringArray.length; i++) {
            String[] tmp = stringArray[i].split("[ ]+");
            stringArray[i] = String.join(" ", tmp);
            sum -= doubleArray[i];
            finalArray.add(stringArray[i] + " Balance " + String.format("%.2f", sum));
        }
        finalArray.add("Total expense  " + String.format("%.2f", doubleArray[0] - sum));
        double avg = (doubleArray[0] - sum) / (doubleArray.length - 1);
        finalArray.add("Average expense  " + String.format("%.2f", round(avg)));


        String toReturn = "";
        for (int i = 0; i < finalArray.size(); i++) {
            toReturn += finalArray.get(i);

            if (i != finalArray.size() - 1) {
                toReturn += "\\r\\n";
            }

        }

        return toReturn;
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
        String L = Arrays.toString(lstOfArt);
        String M = Arrays.toString(lstOf1stLetter);
        System.out.println(L);
        System.out.println(M);


        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        String key = "";
        int value = 0;

        for (String letter : lstOf1stLetter) {
            value = 0;
            for (String code : lstOfArt) {
                Pattern p = Pattern.compile("^[" + letter + "]");
                Matcher m = p.matcher(code);


                if (m.find()) {
                    key = code.substring(m.start(), m.end());

                    p = Pattern.compile("[0-9]+");
                    m = p.matcher(code);

                    while (m.find()) {
                        value += Integer.valueOf(code.substring(m.start(), m.end()));
                    }

                } else {
                    key = letter;
                }

                hashMap.put(key, value);
            }

        }
        Set<Map.Entry<String, Integer>> mapSet = hashMap.entrySet();
        String string = "";
        for (Map.Entry<String, Integer> set : mapSet) {

            if (string.length() > 0) {
                string += " - ";
            }
            String a = set.getKey();
            int b = set.getValue();
            string += "(" + a + " : " + b + ")";
        }
        System.out.println(string);
        return string;
    }
}
