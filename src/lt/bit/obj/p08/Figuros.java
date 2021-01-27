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

    }

    static double area(Figure... figures) {
        double total = 0;
        for (Figure f : figures) {
            System.out.println(f.getClass().getName());
            total += f.area();
        }
        return total;
    }
}


abstract class Figure {

    public abstract double area();

}

class Circle extends Figure {

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

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }
}