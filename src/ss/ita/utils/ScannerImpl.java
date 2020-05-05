package ss.ita.utils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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
    public String enterLine() throws InputMismatchException {
        return scanner.nextLine();
    }


    @Override
    public String enterWord() throws InputMismatchException {
        return scanner.next();
    }
    //I build these methods with help of enterLine()
    public String[] enterLines() {
        List<String> strings = new ArrayList<>();
        String str = enterLine();
        while(!str.equals("")) {
            strings.add(str);
            str = enterLine();
        }
        return (String[]) strings.toArray();
    }

    public String[] enterWords() {
        String str = enterLine();
        return str.split("\\s");
    }
}
