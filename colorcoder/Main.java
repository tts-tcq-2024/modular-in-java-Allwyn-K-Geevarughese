package color;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class Main {
    final static String MajorColorNames[] = { "White", "Red", "Black", "Yellow", "Violet" };
    final static int numberOfMajorColors = MajorColorNames.length;
    final static String MinorColorNames[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
    final static int numberOfMinorColors = MinorColorNames.length;
    static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        return new ColorPair(Color.fromIndex(zeroBasedPairNumber / numberOfMinorColors, MajorColor.class), Color.fromIndex(zeroBasedPairNumber % numberOfMinorColors, MinorColor.class));
    }
    static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }
    static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
        ColorPair colorPair = getColorFromPairNumber(pairNumber);
        assert(colorPair.getMajor().equals(expectedMajor));
        assert(colorPair.getMinor().equals(expectedMinor));
    }
    static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
        assert(getPairNumberFromColor(major, minor) == expectedPairNumber);
    }
    static void printColorCodingManual() {
        for (int pairNumber = 1; pairNumber <= numberOfMajorColors * numberOfMinorColors; pairNumber++) {
            System.out.println("Pair Number: " + pairNumber + ", Color Pair: " + getColorFromPairNumber(pairNumber).toString());
        }
    }

    static void testPrintColorCodingManual() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.printColorCodingManual();
        String expectedOutput = "Color Coding Manual:\n";
        for (int pairNumber = 1; pairNumber <= numberOfMajorColors * numberOfMinorColors; pairNumber++) {
            expectedOutput += "Pair Number: " + pairNumber + ", Color Pair: " + getColorFromPairNumber(pairNumber).toString() + "\n";
        }
        assert(outContent.toString().equals(expectedOutput));
    }
    public static void main(String[] args) {
        testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        testPrintColorCodingManual();
        printColorCodingManual();
    }
}
