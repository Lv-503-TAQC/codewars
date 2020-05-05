package ss.ita.utils;

import java.util.InputMismatchException;

public interface Scannable {
    /**
     * @return int value
     * @throws InputMismatchException
     */
    int enterNumber() throws InputMismatchException;

    int enterNaturalNumber() throws InputMismatchException;

    String enterWord() throws InputMismatchException;
    String enterLine() throws InputMismatchException;
}
