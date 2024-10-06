
package colorCoder;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;

    public ColorPair(MajorColor major, MinorColor minor) {
        this.majorColor = major;
        this.minorColor = minor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }

    @Override
    public String toString() {
        String colorPairStr = Main.MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += Main.MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
}
