package lt.bit.obj.p08.turnyras;

public class Zmogus extends Zaidejas {

    private String name;

    public Zmogus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String vardasPoroje() {
        return name;
    }

    @Override
    public String laimetojas() {
        return name;
    }
}
