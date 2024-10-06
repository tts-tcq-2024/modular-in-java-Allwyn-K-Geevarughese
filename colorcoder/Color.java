
package colorCoder;

public interface Color {
    int getIndex();
    static <E extends Enum<E> & Color> E fromIndex(int index, Class<E> enumClass) {
        for (E color : enumClass.getEnumConstants()) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
}
