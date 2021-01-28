package lt.bit.obj.p09.uzdavinys;

import java.awt.*;

/*
    Sukurti interfeisa Color ir kelias klases implementuojancias ta interfeisa

    Sugalvoti klase Container, kuri implementuoja IContainer.
     t.y. i kurios objekta galima prideti kiek norim objektu su Color interfeisu

 */
public class Uzdavinys {

    public static void main(String[] args) {
        IContainer container = new Container();
        container.add(new A());
        container.add(new A());
        container.add(new B());
        container.add(new B());
        container.add(new A());
        container.add(new A());
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

    @Override
    public void add(Color c) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Color get(int index) {
        return null;
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
    @Override
    public int getColor() {
        return 0;
    }
}

class B implements Color {
    @Override
    public int getColor() {
        return 0;
    }
}