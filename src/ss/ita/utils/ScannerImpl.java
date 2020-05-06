package ss.ita.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerImpl implements Scannable {

//    private static final Logger LOG = LoggerFactory.get

    private Scanner scanner = new Scanner(System.in);

    /*Taras*/
    @Override
    public int enterNumber() throws InputMismatchException {
        try {
            return Integer.parseInt(scanner.next());
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }
    }

    @Override
    public int enterNaturalNumber() throws InputMismatchException {
        try {
            int number = Integer.parseInt(scanner.next());
            if (number > 0) {
                return number;
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }
    }

    @Override
    public double enterDouble() throws InputMismatchException {
        try {
            return Double.parseDouble(scanner.next());
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }
    }

    /*Liuba's method*/
    @Override
    public float enterFloat() throws InputMismatchException {
        try {
            return Float.parseFloat(scanner.next());
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }
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
    public long enterLong() throws InputMismatchException {
        try {
            return Long.parseLong(scanner.next());
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }
    }
}
