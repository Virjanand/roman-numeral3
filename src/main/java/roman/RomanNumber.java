package roman;

public class RomanNumber {
    private final int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String toRoman() {
        String result = "";
        int counter = arabicNumber;
        int thousands = counter / 1000;
        result += convertMultiples(thousands, "M");
        counter -= thousands * 1000;
        if (isNumberContained(counter, 900)) {
            result += "CM";
            counter -= 900;
        }
        if (isNumberContained(counter, 500)) {
            result += "D";
            counter -= 500;
        }
        if (isNumberContained(counter, 400)) {
            result += "CD";
            counter -= 400;
        }
        int hundreds = counter / 100;
        result += convertMultiples(hundreds, "C");
        counter -= hundreds * 100;
        if (isNumberContained(counter, 90)) {
            result += "XC";
            counter -= 90;
        }
        if (isNumberContained(counter, 50)) {
            result += "L";
            counter -= 50;
        }
        if (isNumberContained(counter, 40)) {
            result += "XL";
            counter -= 40;
        }
        int tens = counter / 10;
        result += convertMultiples(tens, "X");
        counter -= tens * 10;
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
        result += convertMultiples(counter, "I");
        return result;
    }

    private String convertMultiples(int number, String romanString) {
        String result = "";
        if (number >= 1) {
            result = romanString.repeat(number);
        }
        return result;
    }

    private boolean isNumberContained(int counter, int number) {
        return counter / number == 1;
    }
}
