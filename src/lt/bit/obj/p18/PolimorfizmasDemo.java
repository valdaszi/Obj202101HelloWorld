package lt.bit.obj.p18;

public class PolimorfizmasDemo {

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new B();
        A a3 = new C();

        System.out.println("a1.m2()");
        a1.m2();

        System.out.println("a2.m2()");
        a2.m2();

        System.out.println("a3.m2()");
        a3.m2();
    }

}

class A {
    protected void m1() {
        System.out.println("A.m1");
    }

    void m2() {
        System.out.println("A.m2");
        m1();
    }
}

class B extends A {
    @Override
    public void m1() {
        System.out.println("B.m1");
    }
}

class C extends A {
    void m2() {
        System.out.println("C.m2");
        m1();
    }
}

