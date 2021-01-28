package lt.bit.obj.p09;

public interface Point {

//    private int points;
//
//    public int getPoints() {
//        return points;
//    }
//
//    public void setPoints(int points) {
//        this.points = points;
//    }
//
//    public void incPoints(int delta) {
//        this.points += delta;
//    }

    int getPoints();
    void setPoints(int points);

    default void incPoints(int delta) {
        setPoints(getPoints() + delta);
    }
}
