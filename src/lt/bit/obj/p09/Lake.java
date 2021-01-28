package lt.bit.obj.p09;

public class Lake extends Static implements Point {

    //TODO ...

    private int points = 10;

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }
}
