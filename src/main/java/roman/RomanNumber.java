package roman;

public class RomanNumber {
    private final int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String toRoman() {
        String result = "";
        int counter = arabicNumber;
        if (counter / 4 == 1) {
            result += "IV";
            counter -= 4;
        }
        if (counter >= 1) {
            result += "I".repeat(counter);
        }
        return result;
    }
}
