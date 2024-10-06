package colorCoder;

public class ColorCoderUtils {
    final static String MajorColorNames[] = { "White", "Red", "Black", "Yellow", "Violet" };
    final static int numberOfMajorColors = MajorColorNames.length;
    final static String MinorColorNames[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
    final static int numberOfMinorColors = MinorColorNames.length;

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        return new ColorPair(Color.fromIndex(zeroBasedPairNumber / numberOfMinorColors, MajorColor.class), Color.fromIndex(zeroBasedPairNumber % numberOfMinorColors, MinorColor.class));
    }

    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }

    public static void printColorCodingManual() {
        for (int pairNumber = 1; pairNumber <= numberOfMajorColors * numberOfMinorColors; pairNumber++) {
            System.out.println("Pair Number: " + pairNumber + ", Color Pair: " + getColorFromPairNumber(pairNumber).toString());
        }
    }
}
