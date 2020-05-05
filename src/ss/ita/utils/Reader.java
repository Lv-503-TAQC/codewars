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
    //Nik's jobs
    public String readWord() {
        System.out.println("enter single word");
        String word;
        try {
            word = scanner.enterWord();
        } catch(Exception e) {
            System.out.println("uncorrec word");
            return this.readWord();
        }
        return word;
    }
    public String readLine() {
        System.out.println("enter string");
        String line;
        try {
            line = scanner.enterLine();
        } catch(Exception e) {
            System.out.println("uncorrect line");
            return this.readLine();
        }
        return line;
    }
}
