package lt.bit.obj.p10;

public class Client extends BaseEntity implements IClear {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void clear() {
        //TODO...
    }

    @Override
    public void setDefaultValues() {
        //TODO...
    }
}
