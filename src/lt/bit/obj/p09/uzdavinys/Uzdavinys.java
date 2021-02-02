package lt.bit.obj.p09.uzdavinys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
    Sukurti interfeisa Color ir kelias klases implementuojancias ta interfeisa

    Sugalvoti klase Container, kuri implementuoja IContainer.
     t.y. i kurios objekta galima prideti kiek norim objektu su Color interfeisu

 */
public class Uzdavinys {

    public static void main(String[] args) {
        int color = 100;
        IContainer container = new Container();
        container.add(new A(color++));
        container.add(new A(color++));
        container.add(new B(color++));
        container.add(new B(color++));
        container.add(new A(color++));
        container.add(new A(color++));

        System.out.println("size = " + container.size());
        for (int i = 0; i < container.size(); i++) {
            Color c = container.get(i);
            System.out.println(c.getColor());
        }

        // System.out.println(container.get(8));

        // String:

        IContainerString container2 = new ContainerString();
        container2.add("A1");
        container2.add("A2");
        container2.add("A3");
        // container2.add(new Date());

        System.out.println("size = " + container2.size());
        for (int i = 0; i < container2.size(); i++) {
            String c = container2.get(i);
            System.out.println(c);
        }

        // Object:

        IContainerObject container3 = new ContainerObject();
        container3.add(new Date());
        container3.add("Kuku");
        container3.add(null);
        container3.add(new A(123));

        System.out.println("size = " + container3.size());
        for (int i = 0; i < container3.size(); i++) {
            Object c = container3.get(i);
            System.out.println(c);
        }

        // Generic

        IContainerGen<Date> container4 = new ContainerGet<Date>();
        container4.add(new Date());
        container4.add(new Date());
        // container4.add("Tekstas");

        IContainerGen<String> container5 = new ContainerGet<>();
        container5.add("A1");
        container5.add("A2");
        // container5.add(new Date());

        IContainerGen container61 = new ContainerGet();
        IContainerGen<Object> container62 = new ContainerGet<>();
        IContainerGen<?> container63 = new ContainerGet<>();

        // Praktinis generic taikymas

        List<Color> listas1 = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            listas1.add(new A(color++));
        }
        System.out.println(listas1.size());
        listas1.remove(500);
        System.out.println(listas1.size());
        listas1.add(100, new B(1));
        System.out.println(listas1.size());

        for (int i = 0; i < 10; i++) {
            System.out.println(listas1.get(i));
        }

        int count = 0;
        for (Color c : listas1) {
            System.out.println(c);
            if (++count == 10) break;
        }

    }
}

class Container implements IContainer {
    // ...
    private Color[] colors = new Color[5];
    private int size; // = 0

    @Override
    public void add(Color c) {
        if (colors.length == size) {
            // praplesti masyva
            Color[] colorsNew = new Color[colors.length + 5];
            for (int i = 0; i < colors.length; i++) colorsNew[i] = colors[i];
            colors = colorsNew;
        }
        colors[size] = c;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Color get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + size);
        }
        return colors[index];
    }
}

interface IContainer {
    void add(Color c);
    int size();
    Color get(int index);
}

interface IContainerString {
    void add(String c);
    int size();
    String get(int index);
}

class ContainerString implements IContainerString {
    // ...
    private String[] colors = new String[5];
    private int size; // = 0

    @Override
    public void add(String c) {
        if (colors.length == size) {
            // praplesti masyva
            String[] colorsNew = new String[colors.length + 5];
            for (int i = 0; i < colors.length; i++) colorsNew[i] = colors[i];
            colors = colorsNew;
        }
        colors[size] = c;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + size);
        }
        return colors[index];
    }
}

interface IContainerObject {
    void add(Object c);
    int size();
    Object get(int index);
}

class ContainerObject implements IContainerObject {
    // ...
    private Object[] colors = new Object[5];
    private int size; // = 0

    @Override
    public void add(Object c) {
        if (colors.length == size) {
            // praplesti masyva
            Object[] colorsNew = new Object[colors.length + 5];
            for (int i = 0; i < colors.length; i++) colorsNew[i] = colors[i];
            colors = colorsNew;
        }
        colors[size] = c;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + size);
        }
        return colors[index];
    }
}

interface Color {
    int getColor();
}

class A implements Color {

    private int color;

    public A(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "A: color=" + color;
    }

}

class B implements Color {

    private int color;

    public B(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color ;
    }
}


// Generic konteineris

interface IContainerGen<T>  {
    void add(T c);
    int size();
    T get(int index);
}

class ContainerGet<T> implements IContainerGen<T> {
    // ...
    private Object[] colors = new Object[5];
    private int size; // = 0

    @Override
    public void add(T c) {
        if (colors.length == size) {
            // praplesti masyva
            Object[] colorsNew = new Object[colors.length + 5];
            for (int i = 0; i < colors.length; i++) colorsNew[i] = colors[i];
            colors = colorsNew;
        }
        colors[size] = c;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + size);
        }
        return (T) colors[index];
    }


    interface Function<P, R> {
        R function(P p);
    }

    class F1 implements Function<Integer, String> {
        @Override
        public String function(Integer p) {
            return String.valueOf(p * 2);
        }
    }
}