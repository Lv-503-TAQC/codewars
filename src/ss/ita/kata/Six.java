package ss.ita.kata;

public interface Six {
//    Build a pile of Cubes
    long findNb(final long m);

//    Easy balance checking
    String balance(final String book);

//    Floating-point Approximation (I)
    double f(final double x);

//    Rainfall
    double mean(final String town, final String strng);

    double variance(final String town, final String strng);

//    Ranking NBA teams
    String nbaCup(final String resultSheet, final String toFind);

//    Help the bookseller !
    String stockSummary(final String[] lstOfArt, final String[] lstOf1stLetter);
}
