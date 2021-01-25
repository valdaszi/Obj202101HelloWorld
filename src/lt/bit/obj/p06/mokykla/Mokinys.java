package lt.bit.obj.p06.mokykla;

public class Mokinys extends Bendri {

    private int klase;
    // ....

    // ...


    public Mokinys() {
        System.out.println("Mokinys()");
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

    public String adresas() {
        return this.adresas.toString();
    }
}
