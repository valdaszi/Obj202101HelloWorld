package lt.bit.obj.p09;

public class Main {

    public static void main(String[] args) {

        Dynamic jonas = new Man();
        Dynamic arklys = new Horse();
        Static tauragnu = new Lake();

        Point point = new Man();
        System.out.println(point.getPoints());

        Object[] objects = { jonas, arklys, tauragnu };

        int totalPoints = 0;
        for (Object o : objects) {
            if (o instanceof Point) {
                totalPoints += ((Point)o).getPoints();
            }
        }
        System.out.println("Total points: " + totalPoints);
    }
}


