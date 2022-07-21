public class PubTrans {

    int passenger;
    int emptySeat;
    int fuel;
    int money;
    int crtfuel = 100;
    int speed;
    int num;
    int crtPassenger;
    String state = "운행불가";

    PubTrans() {}

    public PubTrans(int passenger, int maxPassenger, int fuel, int money, int crtfuel, int speed, int num, String state) {
        this.passenger = passenger;
        this.fuel = fuel;
        this.money = money;
        this.crtfuel = crtfuel;
        this.speed = speed;
        this.num = num;
        this.state = state;
    }

    public PubTrans(int num) {
        this.num = num;
    }

}



