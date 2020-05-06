package ss.ita.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Reader {
    private final ScannerImpl scanner = new ScannerImpl();

    public int readInt() {
        System.out.println("Enter some number");

        int number;
        try {
            number = scanner.enterNaturalNumber();
        } catch (Exception e) {
            System.out.println("It`s not a number, please try again.");
            return this.readInt();
        }
        return number;
    }

    public int readNaturalInt() {
        System.out.println("Enter natural number");

        int number;
        try {
            number = scanner.enterNaturalNumber();
        } catch (Exception e) {
            System.out.println("It`s not a Natural number, please try again.");
            return this.readNaturalInt();
        }

        return number;
    }

    public int[] readNumberArray() {
        System.out.println("Put numbers separating by whitespaces. This numbers will be added to array.");

        String[] input = scanner.enterLine().split("\\s");
        for (int i = 0; i < input.length; i++) {
            try {
                Integer.parseInt(input[i]);
            } catch (NumberFormatException e) {
                System.out.println("You put illegal symbol. Try again please.");
                return this.readNumberArray();
            }
        }

        int[] intArray = new int[input.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(input[i]);
        }

        return intArray;
    }

    public double readDouble() {
        System.out.println("Enter the number of the double type.");

        double doubleNumber;
        try {
            doubleNumber = scanner.enterDouble();
        } catch (Exception e) {
            System.out.println("The value entered is not a number of the double type!");
            return this.readDouble();
        }

        return doubleNumber;
    }

    /*Liuba's method*/
    public float readFloat() {
        System.out.println("Enter the number of the float type.");
        float floatNum;
        try {
            floatNum = scanner.enterFloat();
        } catch (Exception e) {
            System.out.println("The value entered is not a number of the float type!");
            return this.readFloat();
        }
        return floatNum;
    }

    /*Nik*/
    public String readLine() {
        System.out.println("Enter string");
        String str;
        try {
            str = scanner.enterLine();
        } catch (Exception e) {
            System.out.println("Oops! " + e.toString());
            return this.readLine();
        }
        return str;
    }

    public String readWord() {
        System.out.println("Enter single word");
        String str;
        try {
            str = scanner.enterWord();
        } catch (Exception e) {
            System.out.println("Oops! " + e.toString());
            return readWord();
        }
        return str;
    }

    public String[] readLines() {
        List<String> strings = new ArrayList<>();
        System.out.println("Array of strings will be generated from your inputs. Empty string(press'Enter') for stop");
        String str = readLine();
        while (!str.equals("")) {
            strings.add(str);
            str = readLine();
        }
        return (String[]) strings.toArray();
    }

    public String[] readWords() {
        System.out.println("Array of string will be generated from your single input. Each word in line will be separate element in array.");
        return scanner.enterLine().split("\\s");
    }
}
