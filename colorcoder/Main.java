package colorcoder;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {

    static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
        ColorPair colorPair = ColorCoderUtils.getColorFromPairNumber(pairNumber);
        assert(colorPair.getMajor().equals(expectedMajor));
        assert(colorPair.getMinor().equals(expectedMinor));
    }
    static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
        assert(ColorCoderUtils.getPairNumberFromColor(major, minor) == expectedPairNumber);
    }

    static void testPrintColorCodingManual() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.printColorCodingManual();
        String expectedOutput = "Color Coding Manual:\n";
        for (int pairNumber = 1; pairNumber <= numberOfMajorColors * numberOfMinorColors; pairNumber++) {
            expectedOutput += "Pair Number: " + pairNumber + ", Color Pair: " + ColorCoderUtils.getColorFromPairNumber(pairNumber).toString() + "\n";
        }
        assert(outContent.toString().equals(expectedOutput));
    }
    public static void main(String[] args) {
        testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        ColorCoderUtils.testPrintColorCodingManual();
        ColorCoderUtils.printColorCodingManual();
    }
}
