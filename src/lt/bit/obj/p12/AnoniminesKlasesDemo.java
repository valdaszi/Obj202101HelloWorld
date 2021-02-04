package lt.bit.obj.p12;

import java.time.LocalDate;

public class AnoniminesKlasesDemo {

    public static void main(String[] args) {

        class A extends Z {
            private String a;

            public A(int id, String a) {
                super(id);
                this.a = a;
            }

            public String getA() {
                return a;
            }
        }

        Z a = new A(1, "Jonas");
        // a....

        class B extends Z {
            private LocalDate date;

            public B(int id, LocalDate date) {
                super(id);
                this.date = date;
            }

            public LocalDate getDate() {
                return date;
            }
        }

        Z b = new B(2, LocalDate.now());

        Z b2 = new Z(2) {
            private LocalDate date = LocalDate.now();

            public LocalDate getDate() {
                return date;
            }
        };

        class C implements W {
            private int id;

            @Override
            public int getId() {
                return id;
            }
        }

        W w1 = new C();

        class C2 implements W {
            private int id;
            private String name;

            @Override
            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        }

        W w2 = new C2();

        W w3 = new W() {
            private int id;
            private String name;

            @Override
            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        };
    }
}


abstract class Z {
    private int id;

    public Z(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

interface W {
    int getId();
}