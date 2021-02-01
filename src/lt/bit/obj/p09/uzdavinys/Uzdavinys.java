package lt.bit.obj.p09.uzdavinys;

import java.awt.*;

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
    }
}

//TODO...
class Container implements IContainer {
    // ...
    private Color[] colors = new Color[5];
    //TODO ...

    @Override
    public void add(Color c) {
        //TODO ???
    }

    @Override
    public int size() {
        //TODO ???
        return 0;
    }

    @Override
    public Color get(int index) {
        return colors[index];
    }
}

interface IContainer {
    void add(Color c);
    int size();
    Color get(int index);
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