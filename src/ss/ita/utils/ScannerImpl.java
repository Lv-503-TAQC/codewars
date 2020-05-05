package ss.ita.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerImpl implements Scannable {

//    private static final Logger LOG = LoggerFactory.get

    private Scanner scanner = new Scanner(System.in);
    @Override
    public int enterNumber() throws InputMismatchException {
        return scanner.nextInt();
    }

    @Override
    public int enterNaturalNumber() throws InputMismatchException {
        int number = scanner.nextInt();
       if (number < 1){
            throw new InputMismatchException("");
        }
        return number;
    }

    @Override
    public String enterString() throws InputMismatchException {
        return scanner.nextLine();
    }
}
