package lt.bit.obj.p23;

public class DesignPatternsDemo {

    public static void main(String[] args) {

        ComplexObject o1 = ComplexObject.ofA(123);
        ComplexObject o2 = ComplexObject.ofB(456);

        ComplexObject o3 = new ComplexObject(122);

        VeryComplexObject vo1 = VeryComplexObject.builder()
                .setA(100)
                .setD(false)
                .setC("Kuku")
                .build();

        VeryComplexObject vo2 = VeryComplexObject.builder()
                .setC("Yes")
                .setA(999)
                .setC("Hoho")
                .build();
    }
}


class ComplexObject {
    private int a;
    private int b;
    private String c;
    private boolean d;

    private ComplexObject() {}

    public ComplexObject(int a) {
        this.a = a;
    }

    public static ComplexObject ofA(int a) {
        ComplexObject complexObject = new ComplexObject();
        complexObject.a = a;
        return complexObject;
    }

//    public O(int b) {
//        this.b = b;
//    }

    public static ComplexObject ofB(int b) {
        ComplexObject complexObject = new ComplexObject();
        complexObject.b = b;
        return complexObject;
    }

    public ComplexObject(String c) {
        this.c = c;
    }

    public ComplexObject(String c, boolean d) {
        this.c = c;
        this.d = d;
    }

    public ComplexObject(int a, String c, boolean d) {
        this.a = a;
        this.c = c;
        this.d = d;
    }





    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public boolean isD() {
        return d;
    }

    public void setD(boolean d) {
        this.d = d;
    }
}

class VeryComplexObject {
    private int a;
    private int b;
    private String c;
    private boolean d;

    private VeryComplexObject() {}

    static Builder builder() {
        return new Builder();
    }

    static class Builder {

        private VeryComplexObject o = new VeryComplexObject();

        public Builder setA(int a) {
            o.setA(a);
            return this;
        }

        public Builder setB(int b) {
            o.setB(b);
            return this;
        }

        public Builder setC(String c) {
            o.setC(c);
            return this;
        }

        public Builder setD(boolean d) {
            o.setD(d);
            return this;
        }

        public VeryComplexObject build() {
            return o;
        }

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public boolean isD() {
        return d;
    }

    public void setD(boolean d) {
        this.d = d;
    }
}
