package ss.ita.utils;

public class Reader {
    private final ScannerImpl scanner = new ScannerImpl();

    public int readInt() {
        System.out.println("enter number");
        int number;
        try {
            number = scanner.enterNaturalNumber();
        } catch (Exception e) {
            System.out.println("not Natural number");
            return this.readInt();
        }
        return number;
    }
}
