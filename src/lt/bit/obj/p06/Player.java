package lt.bit.obj.p06;

public class Player {

    private String name;
    private int money;

    public Player(String name) {
        this.name = name;
        money = 100;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

//    public void setMoney(int money) {
//        this.money = money;
//    }

    public void transferFrom(Player p, int money) {
        this.money += money;
        p.money -= money;
    }
}
