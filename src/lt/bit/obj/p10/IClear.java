package lt.bit.obj.p10;

public interface IClear {

    /* public abstract */ void clear();

    void setDefaultValues();

    default void setDefault() {
        setDefaultValues();
    }
}
