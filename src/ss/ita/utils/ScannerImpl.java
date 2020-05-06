package ss.ita.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerImpl implements Scannable {

//    private static final Logger LOG = LoggerFactory.get

    private Scanner scanner = new Scanner(System.in);

    /*Taras*/
    @Override
    public int enterNumber() throws InputMismatchException, NumberFormatException {
        return Integer.parseInt(scanner.next());
    }

    @Override
    public int enterNaturalNumber() throws InputMismatchException {
        int number = Integer.parseInt(scanner.next());
        if (number > 0) {
            return number;
        } else {
            throw new InputMismatchException();
        }
    }

    @Override
    public double enterDouble() throws InputMismatchException, NumberFormatException {
        return Double.parseDouble(scanner.next());
    }

    /*Liuba's method*/
    @Override
    public float enterFloat() throws InputMismatchException, NumberFormatException {
        return Float.parseFloat(scanner.next());
    }

    /*Nik*/
    @Override
    public String enterLine() throws InputMismatchException {
        return scanner.nextLine();
    }

    @Override
    public String enterWord() throws InputMismatchException {
        return scanner.next();
    }

    @Override
    public long enterLong() throws InputMismatchException, NumberFormatException {
        return Long.parseLong(scanner.next());
    }
}
