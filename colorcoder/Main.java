package colorcoder;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {
    
    public static void main(String[] args) {
        
        TestColorCoder.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        TestColorCoder.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        TestColorCoder.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        TestColorCoder.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        ColorCoderUtils.printColorCodingManual();
    }
}
