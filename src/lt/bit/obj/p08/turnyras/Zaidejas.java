package lt.bit.obj.p08.turnyras;

public abstract class Zaidejas {

    static private int counter;  // 0, 1, 2, 3, ....

    private int number;

    public Zaidejas() {
        number = ++counter;
    }

    abstract public String vardasPoroje();

    abstract public String laimetojas();

    public int getNumber() {
        return number;
    }
}
