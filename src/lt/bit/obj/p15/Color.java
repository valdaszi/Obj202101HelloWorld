package lt.bit.obj.p15;

//public final class Color {
//
//    public static final Color Red = new Color(0, "Red");
//    public static final Color Yellow = new Color(1, "Yellow");
//    public static final Color Green = new Color(2, "Green");
//
//    private final String name;
//    private final int ordinal;
//
//    private Color(int ordinal, String name) {
//        this.ordinal = ordinal;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return name;
//    }
//
//    public String name() {
//        return name;
//    }
//
//    public int ordinal() {
//        return ordinal;
//    }
//}

import java.util.Arrays;

public enum Color {
    Red(new int[] { 255, 0, 0}),
    Yellow(new int[] { 255, 255, 0}),
    Black(new int[] { 0, 0, 0}),
    Green(new int[] { 0, 255, 0});

    private final int[] rgb;

    Color(int[] rgb) {
        this.rgb = rgb;
    }

//    public void setRgb(int[] rgb) {
//        this.rgb = rgb;
//    }

    public int[] getRgb() {
        return rgb;
    }

    @Override
    public String toString() {
        return name() + " " + Arrays.toString(rgb);
    }

}
