package poly_inher.ex;

public class TeslaCar extends Car{
    @Override
    public void startEngine() {
        System.out.println("테슬라 차량의 엔진이 켜집니다.");
    }

    @Override
    public void offEngine() {
        System.out.println("테슬라 차량의 엔진이 꺼집니다.");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("테슬라 차량의 속도가 올라갑니다.");
    }

    @Override
    public void pressBrake() {
        System.out.println("테슬라 차량의 속도가 내려갑니다.");
    }
    public void charge() {
        System.out.println("배터리를 충전합니다.");
    }
}
