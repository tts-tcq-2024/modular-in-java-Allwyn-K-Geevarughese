
package colorcoder;

public enum MinorColor implements IColorProvider {
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);
    private int index;
    private MinorColor(int index) {
        this.index = index;
    }
    @Override
    public int getIndex() {
        return index;
    }
}
