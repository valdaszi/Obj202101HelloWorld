package lt.bit.obj.p05.intro;

public class Mokinys {

    // private String name; // = null
    private String firstName;
    private String lastName;
    private int level;   // = 0
    private String address;  // = null

    public Mokinys(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        level = 1;
    }

    public Mokinys(String firstName, String lastName, int level) {
        this(firstName, lastName);
//        if (name == null || name.length() <= 1) {
//            // ... klaida:
//            throw new IllegalArgumentException("Neteisingas vardas");
//        }
        this.level = level;
    }

//    public Mokinys() {
//        name = "X";
//        address = "Babtai";
//    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() <= 1) {
            // ... klaida:
            throw new IllegalArgumentException("Neteisingas vardas");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() <= 1) {
            // ... klaida:
            throw new IllegalArgumentException("Neteisingas pavarde");
        }
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String name) {
        if (name == null || name.length() <= 1) {
            // ... klaida:
            throw new IllegalArgumentException("Neteisingas vardas");
        }
//        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
