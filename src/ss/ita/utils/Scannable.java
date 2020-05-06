package ss.ita.utils;

import java.util.InputMismatchException;

public interface Scannable {

    int enterNumber() throws InputMismatchException;

    int enterNaturalNumber() throws InputMismatchException;

    /*Liuba's method*/
    float enterFloat() throws InputMismatchException;

    /*Nik*/
    String enterLine() throws InputMismatchException;

    String enterWord() throws InputMismatchException;

    /*Taras*/
    double enterDouble() throws InputMismatchException;

    /*Mykola*/
    long enterLong() throws InputMismatchException;
}