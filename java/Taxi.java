import java.util.Arrays;

public class Taxi extends PubTrans {

    int maxPassenger = 4;
    int basicPrice = 3000;
    int pricePerDistance = 1000;
    int distance;
    int income;
    int extraCharge;
    int totalIncome;
    String[] desTination = {"", "서울", "대전", "대구", "부산"};


    public Taxi() {
    }

    public Taxi(int num) {
        super(num);
    }


    public void callTaxi(int num) {

    }

    public void getOnTaxi(int passenger, String destination) {       //승객 탑승과 목적지별 거리 상이,택시요금 거리당 추가요금 계산
        this.crtPassenger += passenger;
        this.emptySeat = this.maxPassenger - crtPassenger;
        this.distance = (Arrays.asList(this.desTination).indexOf(destination)) * 10;
        this.extraCharge = this.distance * pricePerDistance;
        income = this.basicPrice + this.extraCharge;

        if ( this.maxPassenger > crtPassenger) {
        System.out.println("탑승한 승객은 " + this.crtPassenger + " 명, 빈 자리는 " + emptySeat + "석 입니다.");
        System.out.println("목적지는 " + destination + ", 거리는 " + this.distance + "Km,");
        System.out.println("기본요금 " + this.basicPrice + ",");
        System.out.println("총 요금은 " + (income) + "원 입니다. 택시 출발하겠습니다.");
        System.out.println("*----------------------------------------*");
    } else {
            System.out.println("최대 승객 수 초과 !");
            System.out.println("*----------------------------------------*");
        }
    }

    public void fuelCheck(int fuel) {                           // 주유량
        crtfuel -= fuel;
        if (crtfuel <= 10) {
            System.out.println("연료가 부족합니다. 주유해 주세요.");
            System.out.println("*----------------------------------------*");
        } else {
            System.out.println("현재 주유량 " + crtfuel + " 입니다. 운행가능.");
            System.out.println("*----------------------------------------*");
        }
    }

    public void payMoney(int money) {
        this.money += money;
        totalIncome += income;                                  // 금액 지불, 모자랄시 안내문구, 금일 총 수익 표시.
        int giveMeMore = income - this.money;
        if (this.money < income) {
            System.out.println("금액이 부족합니다. " + giveMeMore + "원 을 더 지불해주세요.");
        } else {
            System.out.println("받은 금액 " + this.money + " 원. 금일 수익 " + totalIncome + " 원 입니다.");
        }
    }
}





