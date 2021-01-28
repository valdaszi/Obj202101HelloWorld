package lt.bit.obj.p08;

public class Figuros {

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(9.99);
        Square s1 = new Square(10);
        Square s2 = new Square(9.99);

        Figure[] figures = new Figure[] { c1, c2, s1, s2 };
        double t = area(figures);

        System.out.println("total area: " + t);

        System.out.println(area());
        System.out.println(area(c1, s1));
        System.out.println(area(c1, s1, s2, s2, c2));


        System.out.println("c1 counter=" + c1.counter + ", " + c1.getCounter());
        System.out.println("s1 counter=" + s1.counter + ", " + s1.getCounter());

        Figure f1 = c1;
        System.out.println("f1 counter=" + f1.counter + ", " + f1.getCounter());
        Figure f2 = s1;
        System.out.println("f2 counter=" + f2.counter + ", " + f2.getCounter());


    }

    static double area(Figure... figures) {
        double total = 0;
        for (Figure f : figures) {
            System.out.println(f.getClass().getName());
            System.out.println(Circle.getName());
            total += f.area();
        }
        return total;
    }
}


abstract class Figure {

    public int counter = 100;

    public static String getName() {
        return "Figure";
    }

    public abstract double area();

    public int getCounter() {
        return counter;
    }
}

class Circle extends Figure {

    public int counter = 101;

    public static String getName() {
        return "Circle";
    }

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

class Square extends Figure {

    public int counter = 102;

    public static String getName() {
        return "Square";
    }

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public int getCounter() {
        return counter;
    }
}