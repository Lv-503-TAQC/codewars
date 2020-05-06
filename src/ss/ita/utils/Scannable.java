package ss.ita.utils;

import java.util.InputMismatchException;

public interface Scannable {
    /**
     * @return int value
     * @throws InputMismatchException
     */
    int enterNumber() throws InputMismatchException;

    int enterNaturalNumber() throws InputMismatchException;

    /*Liuba's method*/
    float enterFloat() throws InputMismatchException;

    String enterString() throws InputMismatchException;

    /*Nik*/
    String enterLine() throws InputMismatchException;

    String enterWord() throws InputMismatchException;

    /*Mykola*/
    long enterLong() throws InputMismatchException;
}
