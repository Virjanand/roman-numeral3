package roman;

public class RomanNumber {
    private final int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String toRoman() {
        String result = "";
        int counter = arabicNumber;
        int hundreds = counter / 100;
        if (hundreds >= 1) {
            result += "C".repeat(hundreds);
            counter -= hundreds * 100;
        }
        if (isNumberContained(counter, 90)) {
            result += "XC";
            counter -= 90;
        }
        if (isNumberContained(counter, 50)) {
            result += "L";
            counter -= 50;
        }if (isNumberContained(counter, 40)) {
            result += "XL";
            counter -= 40;
        }
        int tens = counter / 10;
        if (tens >= 1) {
            result += "X".repeat(tens);
            counter -= tens * 10;
        }
        if (isNumberContained(counter, 9)) {
            result += "IX";
            counter -= 9;
        }
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
