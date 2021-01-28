package lt.bit.obj.p09;

public class SpecSituacija {
}


interface A {

    int getX();

    default int getY() {
        return getX() * 2;
    }
}

interface B {

    int getX();

    int getZ();

    default int getY() {
        return getZ() * 3;
    }
}

interface B2 extends B {

    int getW();
}

class C implements A, B2, B {

    @Override
    public int getX() {
        return 10;
    }

    @Override
    public int getZ() {
        return 11;
    }

    @Override
    public int getY() {
        return getX() + getZ();
    }

    @Override
    public int getW() {
        return 9;
    }
}