package ss.ita.utils;

import java.util.InputMismatchException;

public interface Scannable {
    /**
     * @return int value
     * @throws InputMismatchException
     */
    int enterNumber() throws InputMismatchException;

    int enterNaturalNumber() throws InputMismatchException;
    //Nik's job
    String enterWord() throws InputMismatchException;
    String enterLine() throws InputMismatchException;

}
