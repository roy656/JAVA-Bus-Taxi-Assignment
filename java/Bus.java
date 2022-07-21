import java.util.Objects;

public class Bus extends PubTrans {

    int totalMoney;
    int crtmoney;
    int maxPassenger = 30;
    int money = 1000;





    public Bus() {
        super();
    }

    public void getOnBus(int passenger) {                 // 승객 탑승
        this.crtPassenger += passenger;
        this.emptySeat = maxPassenger - this.crtPassenger;
        this.crtmoney = money * passenger;
        this.totalMoney += money * this.maxPassenger;

        if (this.crtPassenger < maxPassenger) {
            System.out.println("승객 " + passenger + " 명 이 탑승했습니다.");
            System.out.println("총 승객은 " + crtPassenger + " 명, 빈자리는 " + emptySeat + " 석 입니다.");
            System.out.println("받은 금액 " + this.crtmoney + " 원, 총 탑승료 수익은 " + this.totalMoney + " 원.");
            System.out.println("*-----------------------------------*");
        } else if (this.crtPassenger >= maxPassenger) {
            this.crtPassenger = 0;                           // 최대승객수 초과 후 승객,총수익 0으로 초기화.
            System.out.println("최대승객수 초과로 더이상 탑승이 불가능 합니다.");
            System.out.println("*----------------------------------*");
        }
    }

    public void crtFuel(int fuel) {   //연료 소비
        this.speed += speed;
        this.crtfuel -= fuel;
        if (this.crtfuel <= 50) {
            System.out.println("현재 주유량 " + crtfuel + " 입니다.");
            System.out.println("주유량이 부족 하여 차고지로 이동합니다.");
            System.out.println("*----------------------------------------*");
        } else if (this.crtfuel <10) {
            System.out.println("경고! 주유가 필요합니다 차고지로 이동하세요.");
        } else {
            System.out.println("현재 주유량 " + crtfuel + " 입니다.");
            System.out.println("*----------------------------------------*");
        }
    }

    public void getFuel(int fuel) {     //연료 추가
        this.crtfuel += fuel;
        if (this.crtfuel > 50) {
            System.out.println("차고지에서 " + fuel + " 만큼 주유완료");
            System.out.println("현재 주유량 " + crtfuel + " 입니다. 운행가능");
            System.out.println("*----------------------------------------*");
        } else {
            System.out.println("현재 주유량 " + crtfuel + " 입니다");
            System.out.println("주유가 더 필요합니다");
            System.out.println("*----------------------------------------*");
        }
    }
}

