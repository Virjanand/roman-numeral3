package roman;

public class RomanNumber {
    private final int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String toRoman() {
        String result = "";
        int counter = arabicNumber;
        if (isNumberContained(counter, 5)) {
            result += "V";
            counter -= 5;
        }
        if (isNumberContained(counter, 4)) {
            result += "IV";
            counter -= 4;
        }
        if (counter >= 1) {
            result += "I".repeat(counter);
        }
        return result;
    }

    private boolean isNumberContained(int counter, int number) {
        return counter / number == 1;
    }
}
