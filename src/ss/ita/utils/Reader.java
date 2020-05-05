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

    /*Liuba's method*/
    public float readFloat (){
        System.out.println("Enter the number pf the float type.");
        float floatNum;
            try {
                floatNum = scanner.enterFloat();
            } catch (Exception e) {
            System.out.println("The value entered is not a number of the float type!");
                return this.readFloat();
            }
        return floatNum;
    }
}
