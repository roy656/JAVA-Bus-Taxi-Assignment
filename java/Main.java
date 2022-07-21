public class Main {
    public static void main(String[] args) {

        Bus b1 = new Bus();
        Taxi t1 = new Taxi();         //택시 목적지 옵션은 {서울,대전,대구,부산}

        b1.getOnBus(13);
        b1.crtFuel(90);
        b1.getFuel(50);
        b1.getOnBus(50);
        b1.getOnBus(8);
        t1.getOnTaxi(2,"대구");
        t1.payMoney(3000);
        t1.fuelCheck(90);
        t1.getOnTaxi(5,"부산");







    }

}
