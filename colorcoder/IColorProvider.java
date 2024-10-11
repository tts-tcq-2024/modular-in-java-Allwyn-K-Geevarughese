
package colorcoder;

public interface IColorProvider {
    int getIndex();
    static <E extends Enum<E> & IColorProvider> E fromIndex(int index, Class<E> enumClass) {
        for (E color : enumClass.getEnumConstants()) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
}
